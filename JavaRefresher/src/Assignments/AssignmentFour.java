package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AssignmentFour {
     //gradually resize/drag the window
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
        WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 150, 200)
        //action.pause(Duration.ofSeconds(5))
        //.clickAndHold(resizable)
        .pause(Duration.ofSeconds(5))
        .dragAndDropBy(resizable, 220, 240)
        .clickAndHold()
       // .moveToElement(resizable)
       // .moveByOffset(235, 250)
        .pause(Duration.ofSeconds(5))
        .release().perform();
		 
		driver.close();   
		 //770x150
	}


}
