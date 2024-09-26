package com.may16.practices.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class demo 
{
	public static void main(String[] args)
	{
		Map<Integer,Set<Integer>> hs = new HashMap<>();
		hs.computeIfAbsent(1, k -> new HashSet<>()).add(100);
		hs.computeIfAbsent(2, k -> new HashSet<>()).add(99);
		hs.computeIfAbsent(1, k -> new HashSet<>()).add(20);
        System.out.println(hs);
		
	}

}
