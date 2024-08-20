package javaprogram;

import java.util.Scanner;

public class Switch_case 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("CHROME");
			     break;
		case 2: System.out.println("edge");
	            break;
		case 3: System.out.println("firefox");
	            break;
		case 4: System.out.println("shafari");
                 break;
        
	     default:
	    	 System.out.println("wrong choice");
		}
	
		
	}
}

	

