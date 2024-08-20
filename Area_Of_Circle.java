package javaprogram;

import java.util.Scanner;

public class Area_Of_Circle {
	final static double pi=Math.PI; // we can use this method also instead PI value.
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of r");
		double r=sc.nextDouble();
		double area=pi*r*r;
		System.out.println(area);
		sc.close();
		
	}

}
