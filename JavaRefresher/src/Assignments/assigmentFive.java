package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assigmentFive {

	//perform right click action and hover/select
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		   driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   WebElement img = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		   Actions action = new Actions (driver);
		   action.contextClick(img).perform();
		   
		  WebElement img2 = driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]"));
		  Actions action2 = new Actions (driver);
		  action2.moveToElement(img2).perform();
		  
		  WebElement img3 = driver.findElement(By.xpath("//*[@id=\"dm2m2i1tdT\"]"));
		  Actions action3 = new Actions (driver);
		  action3.moveToElement(img3).perform();
		  
		  
		 WebElement img4 = driver.findElement(By.xpath("//*[@id=\"dm2m1i4tdT\"]"));
		 Actions action4 = new Actions (driver);
		 action4.contextClick(img4).perform();
		 
		   
	}

}
