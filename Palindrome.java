package javaprogram;

public class Palindrome {
	public static void main(String[] args)
	{
		String input="madam";
		String Output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char a=input.charAt(i);
			Output=Output+a;
		}
		System.out.println(Output);
		if(Output.equals(input))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("given string is a not a palindrome");
		}
		
	}

}
