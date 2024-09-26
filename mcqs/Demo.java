package com.stream.mcqs;

public class Demo 
{
	static String str;
	public static void display()
	{
		System.out.println(str);
		
	}

	public static void main(String[] args) 
	{
		String str="hello world";
		str.chars().sorted().forEach(x->System.out.print((char)x));
		System.out.println();
		display();
		
	}
}
