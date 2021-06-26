package com.admindemo.nopcommerce.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.admindemo.nopcommerce.base.TestBase;

public class Utilities extends TestBase{
	
	public static String getScreenshot(WebDriver driver) throws IOException {
		String screenshotFilePath;
		screenshotFilePath= "C:\\temp\\screenshot"+Utilities.timeStamp()+".png";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile , new File(screenshotFilePath));
		
		return screenshotFilePath;
	}
	
	public static String timeStamp() {
		Instant instant= Instant.now();
		return instant.toString().replace("-","_").replace(":", "_").replace(".","_"); 

	}

}
