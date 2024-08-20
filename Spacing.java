package fuction;

import java.util.Arrays;

public class Spacing {
	public static void main(String[] args)
	{
		String in="  sus ";
		int count_space=0;
		char c[]=in.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<=in.length()-1;i++)
		{
			boolean ans=Character.isSpaceChar(c[i]);
			System.out.println(ans);
			if(ans==true)
			{
				count_space++;
			}
		}
		System.out.println(count_space);
	}

}
