package javaprogram;
interface  Google
{
	void mobile();
	void email();
}
interface Filpkart
{
	void test();
}
public class Interface_Programs implements Google,Filpkart
{
	static void test1()
	{
		System.out.println("print the test one method");
	}
	public static void main(String[] args)
	{
		Interface_Programs s=new Interface_Programs();
		s.mobile();
		s.email();
		s.test();
		test1();	
	}
	public void mobile()
	{
		System.out.println("abstract method of google of mobile");
	}
	public void email()
	{
		System.out.println("abstract method of google of email");	
	}
	public void test() {
		System.out.println("abstract method of test");
		
	}

}
