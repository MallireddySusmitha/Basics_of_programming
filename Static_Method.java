package javaprogram;

public class Static_Method {
	static void sum()
	{
		int a=20; // declaration and initialization;
		int b= 30;
		int sums= a+b;
		boolean c= true;
		System.out.println(sums);
		System.out.println(c);
		
	}
     static void sub()
	{
		int a=30;
		int b=53;
		int subs; // declaration
		subs = a-b;
		System.out.println(subs);
	}
	public static void main(String[] args)
	{
		sub();// for static method we can directly call it's method name directly
		sum();
		sub(); //we can call the method multi time;
	}
		

}
