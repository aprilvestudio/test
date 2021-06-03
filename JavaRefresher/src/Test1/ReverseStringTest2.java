package Test1;


public class ReverseStringTest2 {

	public static void main(String[] args) {
		String input = "It is a test string";
		// getBytes() method to convert string
		// into bytes[].
		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		// Store result in reverse order into the
		// result byte[]

		
		/*
		 * if (input.isEmpty() input = null) {
		 * System.out.println("Empty and null strings are not accepeted"); } }
		 */
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		System.out.println(new String(result));
	}
}
