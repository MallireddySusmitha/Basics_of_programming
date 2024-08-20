package javaprogram;

public class Average {
	public static void main(String[] args)
	{
		int a[]=new int[3];
		a[0]=45;
		a[1]=89;
		a[2]=56;
		double sum=0;
		double average=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		average=sum/3;
		System.out.println(average);
		
	}

}
