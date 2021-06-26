package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.admindemo.nopcommerce.base.TestBase;

import testrepo.DashboardPage;
import testrepo.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage login;
	DashboardPage dashboard;

	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initialization();
		login = new LoginPage();
		dashboard=new DashboardPage();

	}

	@AfterClass
	public void kill() {
		tearDown();
	}

	@Test
	public void loginTest() {

		dashboard=login.doLogin();
	}

}
