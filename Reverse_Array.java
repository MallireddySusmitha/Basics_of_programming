package javaprogram;

import java.util.Arrays;

public class Reverse_Array {
	public static void main(String[] args)
	{
		int old[]=new int[3];
		old[0]=1;
		old[1]=2;
		old[2]=3;
		int New[]=new int[3];
		for(int i=0,k=2;i<old.length;i++)
		{
			New[k]=old[i];
			k--;
		}
		System.out.println(Arrays.toString(New));
	}

}
