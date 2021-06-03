package Test1;

public class CalculatorSample {
     int i = 2;
     int ii = 4;
   
    
     public static void main(String[] args) {
    	CalculatorSample calc = new CalculatorSample ();
        calc.getSum(4,2);
 		CalculatorSample calc1 = new CalculatorSample ();
 		calc1.getDifference(4, 2);
 		CalculatorSample calc2 = new CalculatorSample ();
 		calc2.getProduct();
 		CalculatorSample calc3 = new CalculatorSample ();
 		calc3.getDividend();
 		
     }
     private int getDifference(int num1, int num2) {
 	    int result = num1 - num2;
 			
 		System.out.println("The difference is: " + result);
 		
 				
        return result; 
     }
		private int getProduct() {
			int result = ii*i;
			  System.out.println("The product is: " + result);
	    	  
	    	  return result;
		} 
		
		private int getDividend() {
			int result = ii/i;
			  System.out.println("The dividend is: " + result);
	    	  
	    	  return result;
		} 
		
		
		private int getSum(int num1, int num2) {
	    int result = num1 + num2;
			
		System.out.println("The sum is: " + result);
		
				
       return result; 
       
    	
	}

}
