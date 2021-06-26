package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.admindemo.nopcommerce.base.TestBase;

import testrepo.DashboardPage;
import testrepo.LoginPage;

public class DashboardTest extends TestBase {

	LoginPage login;
	DashboardPage dashboard;

	public DashboardTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		login = new LoginPage();
		dashboard = new DashboardPage();

	}

	@AfterClass
	public void kill() {
		tearDown();
	}
	
	
	@Test(priority=1)
	public void clickProduct_catalog() throws Exception {
		dashboard.clickCatalog();
		System.out.println("clicked");
	}

}
