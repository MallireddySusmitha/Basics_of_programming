package javaprogram;

public class Constructor {
	Constructor()
	{
		int a=78;
		int b;
		b=56;
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Constructor n1=new Constructor(); // Constructor will automatically call by creating an object
		new Constructor();                
		Constructor n=new Constructor(); 
	}
	
	
	

}
