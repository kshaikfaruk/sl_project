package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.TechnicalComponent;

public class Products extends TechnicalComponent {

	public static final WebElement addtocart = null;
	public static final String addeditemscount = null;
	public static final String cartitem = null;
	public static final String saucelabsbackpack_text = null;
	public static final String price = null;


	public Products(WebDriver driver) {
		driver=this.driver;
PageFactory.initElements(driver, this);
	}
	

	public void addtocart(WebElement element) {
		TechnicalComponent.click(element);
		logger.log(LogStatus.PASS, " element clicked");
	}


	public void clickiconcart(String cartitem2) {
		// TODO Auto-generated method stub
		
	}


	public void verifyproductname(String saucelabsbackpackText) {
		// TODO Auto-generated method stub
		
	}
	
}