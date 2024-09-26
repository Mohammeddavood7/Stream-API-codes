package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamEvenOrOdd 
{
	public static void main(String[] args) 
	{
		   List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		   list.stream().collect(Collectors.groupingByConcurrent(x->x%2==0,Collectors.groupingByConcurrent(y->y%2!=0))).forEach((k,v)->System.out.println(k+""+v));
		
	}

}
