package javaprogram;

public class Con_Method {
	Con_Method()
	{
		String a="Susmitha";
		a="Mallireddy";
		System.out.println(a);
	}
	Con_Method(int a)
	{
		int a1= 20;
		int b=30;
		int c=a1+b;
		System.out.println(c);	
	}
	Con_Method(char b,int a)
	{
		System.out.println("constructor overloading");
	}
	public static void main(String[] args)
	{
		Con_Method a= new Con_Method();
		Con_Method a1= new Con_Method(1);
		new Con_Method('v',12);	
	}
	

}
