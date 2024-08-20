package fuction;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args)
	{
		String a="ram";
		String b="ar0m";
		if(a.length()!=b.length())
		{
			System.out.println("given string is not a anagram");
		}
		else
		{
			char c1[]=a.toCharArray();
			char c2[]=b.toCharArray();
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			boolean ans=Arrays.equals(c1, c2);
			System.out.println(ans);
			if(ans==true)
			{
				System.out.println("anagram");
				
			}
			else
			{
				System.out.println("not an anagram");
			}
		}
	}

}
