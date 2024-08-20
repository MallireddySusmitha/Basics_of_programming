package javaprogram;

public class Method_Over {
	void add(char c)
	{
		System.out.println("susmitha");
	}
	void add()
	{
		int a= 20;
		System.out.println(a);
	}
	static void sum()
	{
		System.out.println("1");
	}
	static void sum(int a,char c,double d)
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		sum();
		sum(1,'d',5.78);
		Method_Over a1=new Method_Over();
		a1.add();
		a1.add('c');
		
	}

}
