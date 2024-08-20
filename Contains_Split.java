package fuction;

import java.util.Arrays;

public class Contains_Split {
	public static void main(String[] args)
	{
		String a="Manish Kumar Tiwari";
		//contains is used to ckeck whether given string is present or not 
		// return type is boolean;
		System.out.println(a.contains("tiwari"));
		//split
		String c[]=a.split(" ");
		System.out.println(Arrays.toString(c));
		
		//split2 PARAMETER;
		String c1[]=a.split(" ", 1);
		System.out.println(Arrays.toString(c1));
		
		//repeats
		System.out.println(a.repeat(2));
		//isempty
		String a2="susmitha" ;
		System.out.println(a2.isEmpty());
		//ends with
		System.out.println(a2.endsWith("h"));
		
		
	}

}
