package testrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.admindemo.nopcommerce.base.TestBase;
import com.admindemo.nopcommerce.functionUtils.Functions;

public class Products extends TestBase {
	
Functions act = new Functions();
	
	@FindBy(xpath="//div[@class='content-header clearfix']/h1")
	public WebElement productlogo;
	
		
	public Products() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateProductPageTitle() {
		return driver.getTitle();
	}
	
	

}
