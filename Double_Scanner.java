package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Double_Scanner {

	public static void main(String[] args) {
		double a[]=new double[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of double datatype");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextDouble();
		}
		
		System.out.println(Arrays.toString(a));
	}

}
