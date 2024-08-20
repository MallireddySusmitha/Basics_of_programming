package fuction;

public class Palindrome {
	public static void main(String[] args)
	{
		String input="madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			//charAt(index) gives the position of character;
			output=output+c1;
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}

}
