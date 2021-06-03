package Test1;

public class StringDemo {
	public static void main(String args) {
		// string literal - string constant pool
		String str = "Hello";
		
		/*
		 * Hello is the object
		 * str1 is a reference to access the object (Hello)
		 */
		
	//String object - heap
		String str1 = new String("welcome");
		/*
		 * str2 is a reference to access the object (welcome)
		 * if created a new object it will access new reference
		 * otherwise, it can also reference to the same object 
		 */
		str = "Hello 2";
		/*
		 * It will create a new reference to str 1 and the old "Hello" will be removed
		 * use wisely strings to utilize the memory, never overdeclare them
		 */
		
		
		
	}

}
