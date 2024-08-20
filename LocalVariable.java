package javaprogram;

public class LocalVariable {
	static void sum()
	{
		int a=45; // local variable
		int b=78;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		sum();
		int b=56; //local variable;
		System.out.println(b);
	}

}
