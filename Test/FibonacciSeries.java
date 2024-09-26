package Test;



public class FibonacciSeries 
{
    public static void main(String[] args)
    {
    	int numTerms = Integer.parseInt(args[0]);
        int firstTerm = 0, secondTerm = 1;
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= numTerms; i++) 
        {	
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
    }
}
