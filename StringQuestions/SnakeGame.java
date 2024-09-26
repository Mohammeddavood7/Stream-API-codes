package StringQuestions;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SnakeGame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2199254081495945467L;
	private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int UNIT_SIZE = 25;
    private static final int GAME_UNITS = (WIDTH * HEIGHT) / UNIT_SIZE;
    private static final int DELAY = 75;

    private int[] snakeX = new int[GAME_UNITS];
    private int[] snakeY = new int[GAME_UNITS];
    private int snakeLength = 3;
    private int appleX;
    private int appleY;
    private char direction = 'R'; // R - Right, L - Left, U - Up, D - Down
    private boolean running = false;
    private Timer timer;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        startGame();
    }

    private void startGame() {
        running = true;
        spawnApple();
        timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (running) {
                    move();
                    checkApple();
                    checkCollisions();
                    repaint();
                }
            }
        });
        timer.start();
    }

    private void move() {
        for (int i = snakeLength; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }
        switch (direction) {
            case 'U':
                snakeY[0] -= UNIT_SIZE;
                break;
            case 'D':
                snakeY[0] += UNIT_SIZE;
                break;
            case 'L':
                snakeX[0] -= UNIT_SIZE;
                break;
            case 'R':
                snakeX[0] += UNIT_SIZE;
                break;
        }
    }

    private void checkApple() {
        if (snakeX[0] == appleX && snakeY[0] == appleY) {
            snakeLength++;
            spawnApple();
        }
    }

    private void checkCollisions() {
        // Check if snake hits itself
        for (int i = snakeLength; i > 0; i--) {
            if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                running = false;
            }
        }
        // Check if snake hits borders
        if (snakeX[0] < 0 || snakeX[0] >= WIDTH || snakeY[0] < 0 || snakeY[0] >= HEIGHT) {
            running = false;
        }
    }

    private void spawnApple() {
        appleX = (int) (Math.random() * (WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = (int) (Math.random() * (HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    @Override
    public void paint(Graphics g) {
        // Draw background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // Draw apple
        g.setColor(Color.RED);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
        // Draw snake
        for (int i = 0; i < snakeLength; i++) {
            if (i == 0) {
                g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.GREEN.darker());
            }
            g.fillRect(snakeX[i], snakeY[i], UNIT_SIZE, UNIT_SIZE);
        }
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}
