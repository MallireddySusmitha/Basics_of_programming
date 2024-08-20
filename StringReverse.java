package javaprogram;

public class StringReverse {

	public static void main(String[] args)
	{
		String input="susmitha";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		System.out.println("The given string is Reserved-->"+output);

	}

}
