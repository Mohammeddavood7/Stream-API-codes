package com.may16.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo 
{
   public static void main(String[] args)
   {
	   List<Integer> num = Arrays.asList(7,3,7,8,3,2,1);
	   Optional<Integer> max = num.stream().sorted().max((a,b)->a.compareTo(b));
	   System.out.println(max);
	   Optional<Integer> min = num.stream().sorted().min((a,b)->a.compareTo(b));
	   System.out.println(min);

   }
}
