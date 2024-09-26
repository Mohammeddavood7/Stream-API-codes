package Test;

public class A 
{
	static String name = a();
	public A()
	{
		//static
		//non static
		
		System.out.println("a class conts");
		System.out.println(name);
	}
	
	static
	{
		System.out.println("A static Block");
	}
	
	{
		System.out.println("A non static Block");
	}
	
	 static public String a()
	{
		return "a class a() method";
	}
	
}
class B extends A
{
	static String name = "B";
	public B()
	{
		System.out.println("b class conts");
		System.out.println(name);
	}
	
	static
	{
		System.out.println("B static Block");
	}
	
	{
		System.out.println("B non static Block");
	}
	
}

class C extends B
{
	static String name = "C";
	public C()
	{ 
		super(); // this();
		System.out.println("c class conts");
		System.out.println(name);
	}
	
	static
	{
		System.out.println("c static Block");
	}
	
	{
		System.out.println("c non static Block");
	}
	
}


class Demo
{
	public static void main(String[] args) 
	{
		C c = new C();
		
	}
}

















