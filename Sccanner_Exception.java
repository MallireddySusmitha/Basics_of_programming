package javaprogram;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sccanner_Exception {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of array");
		int rollno[]=new int[sc.nextInt()];
		try {
			
		System.out.println("Input the elements of array");
		if(rollno.length<=3) {
		for(int i=0;i<rollno.length;i++) {
			rollno[i]=sc.nextInt();
		}
		}
		else {
			for(int i=0;i<=rollno.length;i++) {
				rollno[i]=sc.nextInt();
			}
		}
			
		}
		catch(InputMismatchException a) {
			System.out.println("The value of input is different from the datatype of array");
			
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("The size of array is smaller than the input elements");
		}
		
		finally {
		System.out.println("The array is-> "+ Arrays.toString(rollno));
		}
		

	}

}
