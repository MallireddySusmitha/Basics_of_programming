package fuction;

import java.util.Arrays;

public class Count_Digit {
	public static void main(String[] args)
	{
		String a="s123 fgu";
		int count=0;
		char[] c=a.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<=a.length()-1;i++)
		{
			boolean ans=Character.isDigit(c[i]);
			System.out.println(ans);
			if(ans==true)
			{
				count++;
			}
		}
		System.out.println(count );
	}

}
