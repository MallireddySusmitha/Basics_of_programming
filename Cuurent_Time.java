package javaprogram;

import java.util.Date;

public class Cuurent_Time {

	public static void main(String[] args) 
	{
		Date d1= new Date();
		//d1.getTime(); -- return type is long;
		System.out.println(d1.getTime());
		Date d2= new Date(d1.getTime());
		System.out.println(d2);
		                String time= d2.toString();
		                String month= time.substring(4, 7);
		                System.out.println(month);
		                String date=time.substring(8,10);
		                System.out.println(date);
		                String year=time.substring(time.length()-4);
		                System.out.println(year);
		                String dateformat =date.concat(month).concat(year);
		                System.out.println(dateformat);
		                String dateformat1 =date.concat(" ").concat(month).concat(" ").concat(year);
		                System.out.println(dateformat1);
		                String dateformat2 =date.concat("-").concat(month).concat("-").concat(year);
		                System.out.println(dateformat2);
		                String dateformat3 =date.concat("/").concat(month).concat("/").concat(year);
		                System.out.println(dateformat3);
		                
		

	}

}
