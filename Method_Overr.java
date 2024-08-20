package javaprogram;
class parents
{
	void login(int a ,int b)
	{
		System.out.println("details of parent class");
	}
		
}


public class Method_Overr extends parents {
	void login(int a,int b)
	{
		super.login(67,90);
		System.out.println("loin details in child class");
		super.login(89,90);
	}
	public static void main(String[] args)
	{
		Method_Overr a=new Method_Overr();
		a.login(10,20);
		
	}

}
