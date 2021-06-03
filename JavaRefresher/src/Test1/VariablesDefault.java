package Test1;

public class VariablesDefault {

	static byte byteVariable;
	static short shortVariable;
	static int integerVariable;
	static long longVariable;
	static float floatVariable;
	static double doubleVariable;
	static boolean booleanVariable;
	static char charVariable;
	
	/*
	 * you can put this here so java will recognize even w/o values
	 */
	public static void main(String[] args) {
		
		/*
		 * to use default values, declare it globally
		 */
		
		System.out.println("Byte Value:" + byteVariable);
		System.out.println("short value:" + shortVariable);
		System.out.println("Int Value:" + integerVariable);
		System.out.println("Long Value:" + longVariable);
		System.out.println("float Value:" + floatVariable);
		System.out.println("double Value:" + doubleVariable);
		System.out.println("Boolean Value:" + booleanVariable);
		System.out.println("char Value:" + charVariable);
	}
	
	public static void oneMoreMethod() {
		System.out.println("Int Value:" + integerVariable);
	}

	
}