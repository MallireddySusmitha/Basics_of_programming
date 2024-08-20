package fuction;

import java.util.Arrays;

public class Special_Character {
	public static int Count=0;
	public static int Count1=0;
	public static int Count2=0;
	
	public static void main(String[] args)
	{
		String a="my name $";
		                 char c1[]=a.toCharArray();
		                 System.out.println(Arrays.toString(c1));
		                 for(int i=0;i<a.length();i++)
		                 {
		                	         boolean ans = Character.isAlphabetic(c1[i]);
		                	         System.out.println(ans);
		                	         if(ans==true)
		                	         {
		                	        	 Count++;
		                	         }
		                 }
		                 System.out.println(Count);
		                 char c2[]=a.toCharArray();
		                 System.out.println(Arrays.toString(c2));
		                 for(int i=0;i<a.length();i++)
		                 {
		                	         boolean ans1= Character.isSpaceChar(c2[i]);
		                	         System.out.println(ans1);
		                	         if(ans1==true)
		                	         {
		                	        	 Count1++;
		                	         }
		                 }
		                 System.out.println(Count1);
		               int c=   a.length()-(Count+Count1);
		               System.out.println(c);
		      
	}

}
