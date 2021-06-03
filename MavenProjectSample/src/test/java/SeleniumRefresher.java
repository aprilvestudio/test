
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

//maven for buildtool, to manage dependency and different selenium, POI, JDBC versions 

public class SeleniumRefresher {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.com/");

	    
	}

}
