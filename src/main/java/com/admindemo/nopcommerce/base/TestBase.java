package com.admindemo.nopcommerce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	
	public static Properties prop;

	public TestBase() {

		try {
			/*
			 * The java.util.Properties class is the subclass of Hashtable. It can be used
			 * to get property value based on the property key. The Properties class
			 * provides methods to get data from the properties file and store data into the
			 * properties file.
			 */
			prop = new Properties();
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/admindemo/nopcommerce/config/config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("Browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
			driver = new ChromeDriver();
		}

		else {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("geckopath"));
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait((Integer.parseInt(prop.getProperty("implicitWait"))), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait((Integer.parseInt(prop.getProperty("pageLoadTimeOut"))), TimeUnit.SECONDS);
		

	}

	public void tearDown() {
	   driver.manage().deleteAllCookies();
		driver.quit();
	}

}
