package fuction;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Double {
	public static void main(String[] args)
	{
		boolean b[]=new boolean[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of boolean");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextBoolean();
		}
		System.out.println(Arrays.toString(b));
				
	}

}
