package fuction;

public class Reserve_String {
	public static void main(String[] args)
	{
		String input="susmitha";
		String Output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			Output=Output+c1;
		}
		System.out.println(Output);
	}

}
