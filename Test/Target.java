package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Target
{

	public static void main(String[] args) 
	{
		List<Integer> al = Arrays.asList(new Integer[]{1,4,6,7,9});
		int target = 10;
		for(int i = 0 ; i <al.size() ; i++)
		{
			int temp = target - al.get(i);
			if(al.contains(temp) && al.get(i) != temp)
			{
				System.out.println(temp+" "+al.get(i));
				break;
			}
		}
		
		
		target = 8;
		
		HashMap<Integer,Integer> hs = new HashMap<>();
		hs.put(1, 2);
		hs.put(2, 4);
		hs.put(3, 6);
		hs.put(4, 7);
		hs.put(5, 9);
		
		for(int i = 1; i <= hs.size();i++)
		{
			int temp = target - hs.get(i);
			if(hs.containsKey(temp)&&hs.get(i) != temp)
			{
				System.out.println(temp+" "+hs.get(i));
				break;
			}
		}


		
		
	}
}





























