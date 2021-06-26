package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.admindemo.nopcommerce.base.TestBase;

import testrepo.DashboardPage;
import testrepo.LoginPage;
import testrepo.Products;

public class ProductTest extends TestBase {
	
	LoginPage login;
	DashboardPage dashboard;
	Products prod;
	
	
	@BeforeClass
	public void setup() throws Exception {
		initialization();
		login = new LoginPage();
		dashboard = new DashboardPage();
		dashboard.clickCatalog();
		prod=new Products();

	}

	@AfterClass
	public void kill() {
		tearDown();
	}

	@Test
	public void validateProductTitleTest() {
		prod.validateProductPageTitle();
	}


}
