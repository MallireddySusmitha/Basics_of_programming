package javaprogram;
class Amazon
{
	private String email="susmitha@email.com";
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String Email)
	{
		this.email=email;
	}
}

public class Encapsulation_Str {

	public static void main(String[] args)
	{
		Amazon a=new Amazon();
		a.setEmail("susmitha01@gmail.com");
		System.out.println(a.getEmail());
	

	}

}
