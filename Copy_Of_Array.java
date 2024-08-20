package fuction;

import java.util.Arrays;

public class Copy_Of_Array {
	public static void main(String[] args)
	{
		int rollno[]= new int[3];
		rollno[0]=34;
		rollno[1]=56;
		rollno[2]=78;
		int rollno1[]=new int[3];
		for(int i=0;i<rollno.length;i++)
		{
			rollno1[i]=rollno[i];
		}
		System.out.println("copy of rollno1");
		System.out.println(Arrays.toString(rollno1));
	}

}
