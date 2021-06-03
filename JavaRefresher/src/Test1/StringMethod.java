package Test1;

public class StringMethod {
	public static void main(String [] args) {
		// class we used to create objects
		//blueprints where we can define methods
		String str = "This is string";
		String str2 = "Hello";
		
		System.out.println(str.length());
		//string length
		int length = str.length();
		// to find the length of the variable
		System.out.println(str.charAt(2));
		//
	    System.out.println(str.equals(str2));
		//compares two given strings
	    System.out.println(str.indexOf('h'));
	    //it will show 1 (if it exists) or -1 (if not)
	    System.out.println("Replace Example "  + str2.replace('e', 'a'));
	    //will replace the old character to new character
		
	}

}
