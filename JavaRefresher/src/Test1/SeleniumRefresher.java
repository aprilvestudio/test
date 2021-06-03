package Test1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumRefresher {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.com/");
	    String title = driver.getTitle();
	    System.out.println(title.length());
	    System.out.println(title);
	   
	    
	    WebElement secondElement = driver.findElement(By.id("abc1"));
	    secondElement.findElements(By.id("abc")).get(2).click();//if the elements are the same and you want to
	    //click the 2nd button
	    driver.close();// current browser
	   // driver.quit();browser window + all related browser in the same session

	    
	}

}
