package javaprogram;

public class This_Ccalling {
	This_Ccalling(int a)
	{
		this("susmitha",9.06);
		System.out.println("CALLING the int a parement");
	}
	This_Ccalling(String a,double b)
	{
		this(10,'v');
		System.out.println("CALLING the string&double parement");
	}
	This_Ccalling(int a,char c)
	{
	
		System.out.println("CALLING the int aand b parement");
	}
	This_Ccalling()
	{
		this(10);
		System.out.println("CALLING the non parement");
	}
	public static void main(String[] args)
	{
	   new 	This_Ccalling();
		
	}

}
