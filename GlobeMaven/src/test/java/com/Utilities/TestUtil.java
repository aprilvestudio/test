package com.Utilities;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.basepage.Test_BaseSetUp;

public class TestUtil extends Test_BaseSetUp {

	public static String screenshotPath;
	public static String screenshotName;
	private static TakesScreenshot driver;

	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));

	}

	public static Object addScreenCapture(String screenshotName2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}