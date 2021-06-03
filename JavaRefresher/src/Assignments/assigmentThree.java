package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigmentThree {

	//handling simple capcha 
	public static By sum = By.id("mathq2");
	public static By result = By.id("mathuserans2");
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://timesofindia.indiatimes.com/poll.cms");
		 driver.manage().window().maximize();
		
		/* for (int sum = 0; sum < 10; sum++) {
				System.out.println("The value is: " + sum);
*/
		/*
		 * String capchavalue = driver.findElement(By.id("mathq2")).getText(); int
		 * firstinteger= Integer.(capchavalue.substring(0,10)); int secondinteger=
		 * Integer.parseInt(capchavalue.substring(0, 10)); int calc=
		 * firstinteger+secondinteger; String final_value= String.valueOf(calc);
		 * driver.findElement(By.id("mathuserans2")).sendKeys(final_value);
		 */
		 //copied from others
		 String numbers = driver.findElement(By.cssSelector("span[id='mathq2']")).getText();

		 String[] values = numbers.split(" ");// to split the numbers/capcha

		 int num1 = Integer.parseInt(values[0]);

		 int num2 = Integer.parseInt(values[2]);

		 String operator = values[1];

		 String finalValue = null;

		 switch (operator){

		 case "+":

		 finalValue = String.valueOf(num1+num2); break;

		 case "-":

		 finalValue = String.valueOf(num1+num2); break;

		 case "*":

		 finalValue = String.valueOf(num1+num2); break;

		 case "/":

		 finalValue = String.valueOf(num1+num2); break;

		 }

		 driver.findElement(By.cssSelector("input[id='mathuserans2']")).sendKeys(finalValue);

		 System.out.println("Number1 : "+num1+"\n"+"Number2 : "+num2+"\n"+"Operator : "+operator+"\n"+"Result : "+finalValue);

		 //driver.close();

		 }



	}

