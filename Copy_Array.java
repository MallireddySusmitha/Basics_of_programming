package javaprogram;

import java.util.Arrays;

public class Copy_Array {
	
		public static void main(String[] args)
		{
		int a[]=new int[3];
		a[0]=45;
		a[1]=56;
		a[2]=67;
		int b[]=new int[3];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
	

}
