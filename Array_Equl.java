package javaprogram;

import java.util.Arrays;

public class Array_Equl {
	public static void main(String[] args)
	{
		int a[]=new int[3];
		int b[]=new int[3];
		a[0]=23;
		a[1]=86;
		a[2]=45;
		b[0]=23;
		b[1]=56;
		b[2]=45;
		boolean ans=Arrays.equals(a,b);
		System.out.println(ans);
		if(ans==true)
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
	}

}
