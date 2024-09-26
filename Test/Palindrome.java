package Test;
public class Palindrome 
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		int original = num;	
        int count = 0;

		if(num <= 0)
		{
			System.out.println("The given number is -ve. Kindly provide a +ve number.");
		}
		else
		{
		
			while(num != 0)
			{
				count++;
				num/=10;
			}
			
			num = original;
			
			if(count == 3)
			{
				
				
				int reversed = 0;
				
					while(num != 0)
					{
						int rem = num%10; 
						reversed = reversed *10+ rem;
						num/=10;
					}
					
					if(reversed == original)
					{
						System.out.println("The number is palindrome.");
						
					}
					else 
					{
						
						System.out.println("The number is not a palindrome.");
					}
			}
	      else
	      {
	        System.out.println("This program can work for three-digit numbers only.");
	      }
		}
	}
}