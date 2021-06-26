package com.admindemo.nopcommerce.functionUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.admindemo.nopcommerce.base.TestBase;
import com.admindemo.nopcommerce.interfaces.Actions;

public class Functions extends TestBase implements Actions {
	

	public void JSClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
				
	}

		
	
	

}
