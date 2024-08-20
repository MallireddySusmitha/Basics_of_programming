package fuction;

import java.util.Arrays;
import java.util.Scanner;

public class Array_String {
	public static void main(String[] args)
	{
		String s[]=new String[3];
		System.out.println("enter the values of string");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			      s[i] =sc.next();
		}
		
		System.out.println(Arrays.toString(s));
	}

}
