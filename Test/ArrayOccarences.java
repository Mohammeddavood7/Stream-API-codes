package Test;

public class ArrayOccarences 
{
	public static void occarences(int[] num)
	{
		for(int i = 0 ; i < num.length ; i++)
		{
			//1,2,3,4,5,1,2,9,3,3
			int number = num[i];
			int count = 0;
			if(number == -1)
			{
				continue;
			}
			
			for ( int j = 0 ; j < num.length ; j++)
			{
				if(num[j] == number)
				{
					count++;
					num[j] = -1;
				}
				
			}
			
			System.out.println(" '"+number+"' Of Occarence '"+count+"' times ");
		}
		
		
	}

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,1,2,9,3,3,2,2,2,2};
		occarences(arr);

	}

}





















