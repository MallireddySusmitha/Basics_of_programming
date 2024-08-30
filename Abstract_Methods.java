package javaprogram;
abstract class Parent2
{
	abstract void add();
	abstract void sub();
	static void multi()
	{
		int a=12;
		int b=45;
		int c=a*b;
		System.out.println(c);
	}
	}
public class Abstract_Methods extends Parent2
{
void div()
{
	System.out.println("print the concrete method of div");
	
}
	public static void main(String[] args)
	{
		Abstract_Methods a1=new Abstract_Methods();
		a1.div();
		multi();
		a1.add();
		a1.sub();
		
	}
	void add() {
		int a=12;
		int b=45;
		int c=a+b;
		System.out.println("abstract method:"+c);
	}
	void sub()
	{
		System.out.println("abstract method of sub");
	}

}
