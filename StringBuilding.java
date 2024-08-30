package javaprogram;

public class StringBuilding {

public static void main(String[] args)
	{
          	StringBuilder s1=new StringBuilder ("Banglore");
          	s1.append(" is city");
          	System.out.println(s1);
          System.out.println(s1.insert(12, "the "));	
          System.out.println(s1.replace(0, 6, "ongole"));
          StringBuilder s2=new StringBuilder ("Manish");
          System.out.println(s2.replace(0, 6, "Abhishek"));
          System.out.println(s2.delete(0, 4));
          StringBuilder s3=new StringBuilder ("Banglore");
          System.out.println(s3.reverse());
          System.out.println(s3.capacity());
          System.out.println(s3.length());
          System.out.println(s3.charAt(1));
          StringBuilder s4=new StringBuilder ("susmitha");
          System.out.println(s4.substring(4));
          System.out.println(s4.substring(0, 7));
         
         
          
	}
          	

	

}
