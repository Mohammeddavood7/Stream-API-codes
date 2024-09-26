package com.may16.Test;

import java.util.Arrays;
import java.util.List;

record Student(Integer grade,String name) {}

public class Test 
{
	public static void main(String[] args)
	{

		List<Student> s = Arrays.asList(new Student(55,"smith"),new Student(35,"scott"),new Student(77,"ward"),new Student(99,"john"));
		s.stream().filter(stud -> stud.grade() > 35).forEach(System.out::println);
	}

}
