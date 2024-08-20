package javaprogram;
import java.util.Scanner;

public class CircumferebceOfTriangle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		double a= sc.nextDouble();
		System.out.println("Enter the value of b ");
		double b= sc.nextDouble();
		System.out.println("Enter the value of c ");
		double c= sc.nextDouble();
		double circ=a+b+c;
		System.out.println(circ);

	}

}
