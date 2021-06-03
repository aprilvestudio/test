/**  This is to set up the project
 * ${0301218}

* ${xurpas-enterprise}
 */

package com.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Utilities.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import java.io.IOException;

public class Test_BaseSetUp {

	private WebDriver driver;
   // static String driverPath = "C:\\Users\\April\\Documents\\PENG\\Tools\\chromedriver.exe";
	public WebDriver getDriver() {
		return driver;
		
	}
	
    //will open the browser you set up in xml (switch is used for choices)
	public void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			System.out.println("Launching Chrome as browser of choice");
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			System.out.println("Launching Firefox as browser of choice");
			break;
			default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			
			driver = initFirefoxDriver(appURL);
			driver = initChromeDriver(appURL);
		}
	}

	public static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome..");
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\src\\test\\resources\\com\\executables\\chromedriver.exe");
		WebDriverManager.getInstance(CHROME).setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	public static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		//System.setProperty("webdriver.firefox.driver", driverPath
			//	+ "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(appURL);
		return driver;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	public static void verifyEquals(String expected, String actual) throws IOException {

		try {

			Assert.assertEquals(actual, expected);

		} catch (Throwable t) {

			TestUtil.captureScreenshot();
			// ReportNG
			Reporter.log("<br>" + "Verification failure : " + t.getMessage() + "<br>");
			Reporter.log("<a target=\"_blank\" href=" + TestUtil.screenshotName + "><img src=" + TestUtil.screenshotName
					+ " height=200 width=200></img></a>");
			Reporter.log("<br>");
			Reporter.log("<br>");
			// Extent Reports
			//TestUtil.log(LogStatus.FAIL, " Verification failed with exception : " + t.getMessage());
			//TestUtil.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));

		}
	}
	@AfterSuite
		public void tearDown() {

			if (driver != null) {
				driver.quit();
			}

			//log.debug("test execution completed !!!");
		}
	}
