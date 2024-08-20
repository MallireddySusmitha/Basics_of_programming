package javaprogram;

public class Given_Number {
	public static void main(String[] args)
	{
		int a[]=new int[4];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=65;
		int Given_number=65;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==Given_number)
			{
				System.out.println("Given string is a part of a number");
			}
			else
			{
				System.out.println("Given string is not a part of a number");
			}
		}
	}

}
