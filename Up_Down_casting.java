package javaprogram;
class Parent78
{
	void add()
	{
		System.out.println("parent add");
	}
	void sub()
	{
		System.out.println("parent sub");

	}
	static void mul()
	{
		System.out.println("parent non static mul");

	}
	static void div()
	{
		System.out.println("parent non static div");

	}
}

public class Up_Down_casting extends Parent78
{
	void add12()
	{
		System.out.println("child add1");
	}
	void sub1()
	{
		System.out.println("childsub1");

	}
	static void mul1()
	{
		System.out.println("childnon static mul1");

	}
	static void div1()
	{
		System.out.println("chils non static div1");

	}

	public static void main(String[] args)
	{
		Parent78 p=new 	Up_Down_casting ();// upcasting
		Up_Down_casting c=(Up_Down_casting ) p; // downcasting
		c.add();
		c.add12();
		c.sub();
		c.sub1();
		div1();
		div();
		mul();
		mul1();
		

		}

	}


