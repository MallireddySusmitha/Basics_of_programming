package javaprogram;

public class This_Keyword {
	int a;
	double salary;
	String name;
	void details(int a,double salary,String name)
	{
		System.out.println("Susmitha");
		this.a=a;
		this.salary=salary;
		this.name=name;	;
	}
	public static void main(String[] args)
	{
		This_Keyword a=new This_Keyword();
		a.details(10, 80.0, "Automation");
		System.out.println(a.salary);
		System.out.println(a.a);
		System.out.println(a.name);
	}

}
