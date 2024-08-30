package javaprogram;
class parent_Run
{
	void add()
	{
		System.out.println("add method of parent");
	}
	void sub()
	{
		System.out.println("sub of parent method");
	}

}

public class Run_Polym extends parent_Run
{
	void add()
	{
		super.add();
		System.out.println("add method of child");
	}
	void sub()
	{
		super.sub();
		System.out.println("sub of child child");
	}

	public static void main(String[] args) 
	{
		Run_Polym r=new Run_Polym();
		r.add();
		r.sub();
	}

}
