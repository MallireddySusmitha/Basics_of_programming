package fuction;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) 
	{
		int a[]=new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		int b[]=new int[4];
		for(int i=0,k=b.length-1;i<a.length;i++)
		{
			b[k]=a[i];
			k--;
			
		}
		System.out.println(Arrays.toString(b));
		

	}

}
