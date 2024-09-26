package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UsingStreamfindLength 
{
	public static void main(String[] args) 
	{
		 List<String> word = Arrays.asList("Write a java program using stream api ");
		 Stream<String> flatMap = word.stream().flatMap(m->Stream.of(m.split(" ")));
		 flatMap.forEach(x->System.out.println("The '"+x+"' is length: "+x.length()));
	}
}



























