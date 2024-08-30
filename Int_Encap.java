package javaprogram;
class Sentive
{
	private int otp=0000;
	public int  getOtp()
	{
		return otp;
	}
	public void setOtp(int otp)
	{
		this.otp=otp;
	}
}

public class Int_Encap {

	public static void main(String[] args) 
	{
		Sentive s=new Sentive();
		s.setOtp(1234);
		System.out.println(s.getOtp());

	}

}
