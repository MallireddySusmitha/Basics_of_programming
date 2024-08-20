package fuction;

public class Multi_Char_Search {

	public static void main(String[] args) {
		String a="ramu";
		//checking the giving string starts with r
		System.out.println(a.matches("r(.*)")); // gives return type boolean;
		// checking the given string contains 4 letters are not ?
		System.out.println(a.matches("...."));
		//checking given string ends with u or not/
		System.out.println(a.matches("(.*)u"));
		//checking given string start with r and ends with u?
		System.out.println(a.matches("r(.*)u"));
		
		

	}

}
