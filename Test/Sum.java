package Test;

public class Sum 
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		
		if( num > 0 && num < 1000)
		{
			 int number = num;
			 int sum = 0;
		
		  while(num != 0 )
		  {
			   sum += num % 10;
			   num/=10;
			  
			  
		  }
		  System.out.println("The sum of all digits in "+ number +" is "+sum);
		}
		else 
		{     
			System.out.println("Invalid input! Please enter a number between 0 and 1000.");

		}
		
	}

}
