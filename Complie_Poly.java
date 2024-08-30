package javaprogram;

public class Complie_Poly
{
	void add()
	{
		System.out.println("add");
	}
		void add(int a)
	
		{
			System.out.println("add inta");
		}
		static void add(char c)
		{
			System.out.println("add static");
		}
	

	public static void main(String[] args)
	
	{
		Complie_Poly p1=new Complie_Poly();
		p1.add();
		p1.add(10);
		add('c');
	}

}
