package javaprogram;

class superparent
{
	static void details()
	{
		System.out.println("it will excute superparent");
	}
}
class parent1 extends superparent
{
    void student()
   {
	System.out.println("it will excute parent");
   }
}
public class Multi_Level extends parent1{
	 void child()
	{
		System.out.println("it can excute child");
	}
	public static void main(String[] args)
	{
		Multi_Level a=new Multi_Level();
		a.child();
		a.student();
		details();	
	}
}
	


