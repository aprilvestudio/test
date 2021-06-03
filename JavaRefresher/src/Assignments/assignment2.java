package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//dropwdown menu
public class assignment2 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://way2automation.com/way2auto_jquery/index.php");
		 driver.manage().window().maximize();
		 System.out.println("Inputting info");
		 
		 driver.findElement(By.name("name")).sendKeys("Test Only");
		 WebElement dropdown = driver.findElement(By.name("country"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("Philippines");
	

		 WebElement element = null; 
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")));
		 element.click();
		 
			

		System.out.println("Successfully submit the form");
		driver.quit();
	}

}
