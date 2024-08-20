package fuction;

public class Average_Of_String {
	public static void main(String[] args)
	{
		double[] a=new double [4];
		a[0]=17;
		a[1]=35;
		a[2]=81;
		a[3]=42;
		double sum=0;
		double average=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		average=sum/4;
		System.out.println(average);
		
		
			
	}

}
