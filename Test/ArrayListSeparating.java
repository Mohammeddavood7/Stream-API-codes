package Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSeparating
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numberStore = new ArrayList<>();
		ArrayList<String> stringStore = new ArrayList<>();
		
		List li =new ArrayList();
		li.add("11");
		li.add("asdf");
		li.add(12);
		li.add("asdf3");
		li.add("asdf4");
		li.add(13);
		
		for(int i = 0 ; i < li.size() ; i++)
		{
			Object object = li.get(i);
			String number  = object+"";
			try 
			{
				int int1 = Integer.parseInt(number);
				numberStore.add(int1);
			} 
			catch (Exception e) 
			{
				stringStore.add(number);
			}
		}

		System.out.println(numberStore);
		System.out.println(stringStore);
		
	}

}

















