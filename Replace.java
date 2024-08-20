package fuction;

public class Replace {

	public static void main(String[] args) {
		//in the mane Manish replace M with H
		String a="Manish";
		System.out.println(a.replace("M", "h"));
		
		// IN THE given String Avinah Yadav of all Captial letters?
		System.out.println(a.replaceAll("[A-Z]", ""));
		// IN THE given String Avinah Yadav of all lower letters?
				System.out.println(a.replaceAll("[a-z]", ""));
		String a2="no 123 Banglore";
		// IN THE given String of all digits letters?
		System.out.println(a2.replaceAll("[0-9]", ""));
		//remove the spaces in the given string
		String  a3="Manish Kumar Tiwari";
		System.out.println(a3.replace(" ", ""));
		a.

	}

}
