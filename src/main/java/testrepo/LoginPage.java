package testrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.admindemo.nopcommerce.base.TestBase;
import com.admindemo.nopcommerce.functionUtils.Functions;

public class LoginPage extends TestBase {

	Functions act = new Functions();

	@FindBy(id = "Email")
	public WebElement txt_username;

	@FindBy(id = "Password")
	public WebElement txt_password;

	@FindBy(xpath = "//div/button[contains(text(),'Log in')]")
	public WebElement btn_submit;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public DashboardPage doLogin() {
		/*txt_username.clear();
		txt_username.sendKeys(uname);
		txt_password.clear();
		txt_password.sendKeys(pwd);
		*/
		act.JSClick(driver, btn_submit);
		return new DashboardPage();

	}

}
