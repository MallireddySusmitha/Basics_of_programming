package javaprogram;

public class Sttring_Exceptions
{
	public static void main(String[] args)
	{
		String s="susmitha";
		try
		{
			System.out.println(s.charAt(8));
	}
		catch(StringIndexOutOfBoundsException a1)
		{
			System.out.println(s);
		}
		
	}

}
