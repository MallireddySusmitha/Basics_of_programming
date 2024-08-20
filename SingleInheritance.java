package javaprogram;
class parent // super class
{
	static void login1()
	{
		System.out.println("Login with both");
	}
	
}

public class SingleInheritance extends parent{  //sub class
	void login()
	{
		System.out.println("mobile number");
	}
	static void loginmail()
	{
		System.out.println("mailid");
	}

	public static void main(String[] args)
	{
		SingleInheritance a=new SingleInheritance();
		loginmail();
		a.login();
		login1();
		
	}

}
