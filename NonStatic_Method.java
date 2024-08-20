package javaprogram;

public class NonStatic_Method {
	
		 void div()
		{
			int a=20; // declaration and initialization;
			int b= 30;
			int div= a/b;
			System.out.println(div);
			String S= "Mallireddy Susmitha";
			System.out.println(S);
			
		}
	     void sub()
		{
			int a=30;
			int b=53;
			int subs; // declaration
			subs = a-b;
			System.out.println(subs);
		}
		public static void main(String[] args)
		{
			NonStatic_Method n1 =new NonStatic_Method();// creating an object with the help of the reference varaible
			n1.sub();
			n1.div();// call the method with help of reference variable;
			
		}
		 

}
