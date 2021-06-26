package testrepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.admindemo.nopcommerce.base.TestBase;
import com.admindemo.nopcommerce.functionUtils.Functions;

public class DashboardPage extends TestBase{
	Functions act = new Functions();
	
	@FindBy(xpath="//div[@class='content-header']/h1")
	public WebElement dashboardlogo;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p")
	public WebElement txt_catalog;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a/p")
	public WebElement txt_catalog_Product;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateDashboardTitle() {
		String title_on_dashboradPage= driver.getTitle();
		return title_on_dashboradPage;
	}
	
	public Products clickCatalog() throws Exception {
		/*txt_catalog.click();
		Thread.sleep(3000);
		txt_catalog_Product.click();
		//return new Products();
		
		
		*/
		
		List<WebElement> catalog_menulist=driver.findElements(By.xpath("//li[@class='nav-item has-treeview menu-open']"));
		int size=catalog_menulist.size();
		for(int i=0;i<size;i++) {
			System.out.println("catalog menu list ->" +catalog_menulist.get(i).getText());
			
			if(catalog_menulist.get(i).getText().equals("Products")) {
				catalog_menulist.get(i).click();
				
			}
				
				
			}
		return new Products();
	}
	
	
	

}
