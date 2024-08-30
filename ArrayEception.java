package javaprogram;

import java.util.Arrays;

public class ArrayEception 
{
	public static void main(String[] args)
	{
		int a[]=new int[4];
		a[0]=12;
		a[1]=67;
		a[2]=78;
		a[3]=67;
		try
		{
		     a[4]=99;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
		           System.out.println(Arrays.toString(a));
		}
	}

}
