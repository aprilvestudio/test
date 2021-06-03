package Test1;

public class Variables {

	public static void main(String[] args) {
		System.out.println("This is it!");
		//this is my first java program
		/*
		 * Byte
		 * Min: -128
		 * Max: 127
		 * Default:0
		 */
		byte byteVariable = 100;
		System.out.println("Byte Value:" + byteVariable);
		
	     /*
	      * Short
	      * Min: -32,768
	      * Max: 32,768
	      * Default: 0
	      */
		short shortVariable = 1000;
		System.out.println("short value:" + shortVariable);
		
		/*
		 * int
		 * Min: -2,147,483,648
		 * Max: 2,147,483,648
		 * Default:0
		 */
		int integerVariable = 10000;
		System.out.println("Int Value:" + integerVariable);
		
		/*
		 * long
		 * Min: -2^63
		 * Max: 2^63-1
		 * Deafult:0
		 */
		long longVariable = 100000L;
		System.out.println("Long Value:" + longVariable);
		
		/*
		 * float
		 * Default: 0.0f
		 */
		float floatVariable = 20.1f;
		System.out.println("float Value:" + floatVariable);
		
		/*
		 * double
		 * Default: 0.0d
		 */
		double doubleVariable = 60.33;
		System.out.println("double Value:" + doubleVariable);
		
		
		/*
		 * boolean
		 * false and true
		 * Default: false
		 */
		boolean booleanValue = true;
		System.out.println("Boolean Value:" + booleanValue);
		
		/*
		 * char
		 */
		char charValue = 'a';
		System.out.println("char Value:" + charValue);
	}
}