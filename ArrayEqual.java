package fuction;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) 
	{
		int no[]=new int[3];
		no[0]=23;
		no[1]=34;
		no[2]=56;
		int no1[]=new int[3];
		no1[0]=23;
		no1[1]=34;
		no1[2]=56;
		if(true==Arrays.equals(no, no1))
		{
			System.out.println("Given both strings are equal");
		}
		else
		{
			System.out.println("Given both strings are not equal");
		}
		

	}

}
