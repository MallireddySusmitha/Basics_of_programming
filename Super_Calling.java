package javaprogram;
class superparent1
{
	superparent1( int a)
	{
		System.out.println("details of superparent calss");
	}
	
}

class details1 extends superparent1
{
	 details1(double b)
	{
		 super(12);
		System.out.println("No of students present in the calls");
	}
}

public class Super_Calling extends details1{
	Super_Calling()
	{
		super(10.0);
		System.out.println("we can details of students");
	}
	public static void main(String[] args)
	{
		new Super_Calling();
	}
}
