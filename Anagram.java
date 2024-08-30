package javaprogram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		String s="face";
		String s1="cafe";
		if(s1.length()!=s1.length())
		{
			System.out.println("strings are not angrams");
		}
		else
		{
			  char[] c1= s.toCharArray();
			  char [] c2=s1.toCharArray();
			  System.out.println(Arrays.toString(c1));
			  System.out.println(Arrays.toString(c2));
			  Arrays.sort(c1);
			  Arrays.sort(c2);
			  System.out.println(Arrays.toString(c1));
			  System.out.println(Arrays.toString(c2));
			  System.out.println(Arrays.equals(c1, c2));
		}
		

	}

}
