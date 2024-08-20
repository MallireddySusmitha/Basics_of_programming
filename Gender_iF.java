package javaprogram;

public class Gender_iF {
	public static void main(String[] args)
	{
		char Gen1='F';
		char Gen2='M';
		int age=59;
		if(Gen1=='X')
		{
			System.out.println("Female Travelling is free");
		}
		else
		{
			if(age<=12)
			{
				System.out.println("Half ticket");
			}
			else if(age>=12 && age<=59)
			{
				System.out.println("Full Ticket");
			}
			else 
			{
				System.out.println("Senior Citizen Ticket");
			}		
				
		}
		
	}

}
