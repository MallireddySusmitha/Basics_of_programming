package javaprogram;

import java.util.Arrays;

public class Alpha_Digit_Space {
	static int count_alpha;
	static int count_digit;
	static int count_space;
	public static void main(String[] args)
	{
		String a="my name is 123$@";
		char c[]=a.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<=a.length()-1;i++)
		{
			boolean ans=Character.isAlphabetic(c[i]);
					System.out.println(ans);
					if(ans==true)
					{
						count_alpha++;
					}
			
		}
		System.out.println(count_alpha);
		System.out.println("Find out digits number");
		for(int i=0;i<=a.length()-1;i++)
		{
			boolean ans1=Character.isDigit(c[i]);
					System.out.println(ans1);
					if(ans1==true)
					{
						count_digit++;
					}
			
		}
		System.out.println(count_digit);
		System.out.println("Find out space number");
		for(int i=0;i<=a.length()-1;i++)
		{
			boolean ans2=Character.isSpaceChar(c[i]);
					System.out.println(ans2);
					if(ans2==true)
					{
						count_space++;
					}
			
		}
		System.out.println( count_space);
	}

}
