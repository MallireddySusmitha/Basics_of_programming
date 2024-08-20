package fuction;

public class String_Of_Number {

	public static void main(String[] args) {
		int no[]=new int[4];
		no[0]=45;
		no[1]=56;
		no[2]=58;
		no[3]=67;
		int Given_Number=56;
		for(int i=0;i<no.length;i++)
		{
			if(Given_Number==no[i])
			{
				System.out.println("given number index "+ i);
			}
			else
			{
				System.out.println("not found");
			}
		}
		

	}

}
