/**  This is to call the methods we did on login page. We will execute the login function here.
 * ${0301218}

* ${xurpas-enterprise}
 */

package com.tests;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.basepage.Test_BaseSetUp;
import com.pages.BasePage;
import com.pages.GlobeLogin;
import org.testng.Reporter;


public class GlobeLoginTest extends Test_BaseSetUp {
		
	    WebDriver driver; 
	    private com.pages.GlobeLogin logInPage;
	    private com.pages.BasePage basePage;


		@BeforeClass
		public void setUp (){
		driver = getDriver();
  
		}
		@Test
		public void verifySignInFunction() throws Exception {
		   try {
			System.out.println("Sign In functionality details...");
			basePage = new BasePage(driver);
			logInPage = basePage.clickSignInBtn(); // to call the click sign in button method
			//logInPage.verifySignIn();// to call the verify sign in method
			//logInPage.getErrorMessage();
		   }
		   catch (TimeoutException e){ 
			  System.out.println("Page:" + logInPage + "did not load within 40 seconds" );
			   
		   }
			Assert.assertTrue(logInPage.verifySignIn(), "The username and password is invalid. Plsease try again. ");
		     // Assert is to report a failure in testNG
		   // Assert.assertTrue(logInPage.equals("errorMsgTxt : + The username and password is invalid. Please try again. "));
			//log.debug("Login successfully executed");
		}

	}
