package fuction;

import java.util.Arrays;

public class Count_Number {
	public static void main(String[] args)
	{
		String a="my name 123 susmitha";
		int Count_letter=0;
		char a1[]=a.toCharArray();//to converts string int to char array;
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<=a.length()-1;i++)
		{
			boolean answer=Character.isAlphabetic(a1[i]);
			System.out.println(answer);
			if(answer==true)
			{
				Count_letter++;
				//System.out.println(Count_letter);
				
			}
		}
		System.out.println(Count_letter);
	}
	
	

}
