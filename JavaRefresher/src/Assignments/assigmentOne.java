package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigmentOne {
     //navigate the site and get the total links
	
	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com/");
	    WebElement search = driver.findElement(By.name("q")); 
	    search.sendKeys("way2automation");
	    search.submit();
	   System.out.println("searching way2automation");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.findElement(By.partialLinkText("Way2Automation")).click();
	   System.out.println("navigating the site");
	   
	   List<WebElement> alLinks = driver.findElements(By.tagName("a"));
     
	   System.out.println(alLinks.size() + " - " + alLinks.get(0));
	   System.out.println("Total links are : " + alLinks.size());
	   //System.out.println("Links are: " + (((WebElement) By.tagName("a")).getText());
	   
	}

}
