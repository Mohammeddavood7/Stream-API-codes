package Test;

public class Switch 
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		switch(num)
		{
		   case 1: System.out.println("The name of month 1 is January"); break;
		   case 2: System.out.println("The name of month 2 is February"); break;
		   case 3: System.out.println("The name of month 3 is March"); break;
		   case 4: System.out.println("The name of month 4 is April"); break;
		   case 5: System.out.println("The name of month 5 is May"); break;
		   case 6: System.out.println("The name of month 6 is June"); break;
		   case 7: System.out.println("The name of month 7 is July"); break;
		   case 8: System.out.println("The name of month 8 is August"); break;
		   case 9: System.out.println("The name of month 9 is September"); break;
		   case 10: System.out.println("The name of month 10 is October"); break;
		   case 11: System.out.println("The name of month 11 is November"); break;
		   case 12: System.out.println("The name of month 12 is December"); break;
		   default:System.out.println("Invalid number. Please enter 1 -12 number !!");

		   
		}
		
	}

}
