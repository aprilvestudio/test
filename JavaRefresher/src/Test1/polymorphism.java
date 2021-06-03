package Test1;

public class polymorphism {
	
	/* Type of Poly:
	 * 1. Compile time - can be also called as early binding/
	 * static binding/overloading
	 * Same method name and different signature
	 * In same class we have multiple methods with same name
	 * but different method signature
	 * 2. Runtime - overriding/dynamic binding/late binding
	 * diff classes (with inheritance applied) methods with same
	 * method signature
	 */
	

	public void getAccountName (String Name) {

	}
	
	public void getAccountName (String Name, int Amount) {
// same method name but different bc of additional parameter
}

}