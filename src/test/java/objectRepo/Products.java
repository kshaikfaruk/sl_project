package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.TechnicalComponent;

public class Products extends TechnicalComponent {

	public Products(WebDriver driver) {
		driver=this.driver;
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class='btn_primary btn_inventory'])[1]")
	public WebElement addtocart;
	
	@FindBy(xpath="//span[@class='fa-layers-counter shopping_cart_badge']")
	public WebElement addeditemscount;
	
	public void addtocart(WebElement element) {
		TechnicalComponent.click(element);
		logger.log(LogStatus.PASS, " element clicked");
	}
	
	 public void verifyaddeditemsvalue(WebElement element) {
		 String text=TechnicalComponent.gettext(element);
		 int i=Integer.parseInt(text);
		 if(i==1) {
			 logger.log(LogStatus.PASS, "Text is verified");
		 }else {
			 logger.log(LogStatus.FAIL,"text is not verified");
		 }
		 
	 }
}
