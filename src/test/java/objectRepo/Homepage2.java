package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.TechnicalComponent;

public class Homepage2  extends TechnicalComponent{

	public Homepage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//strong[contains(text(),'XYZ Bank')]")
	public WebElement mainHeading;
	
	
	
	public void verifyMain_heading(WebElement element,String text) {
		String actualresult=TechnicalComponent.gettext(element);
		if(actualresult.equalsIgnoreCase(text)) {
			logger.log(LogStatus.PASS, " text is verififed");
		}else {
			logger.log(LogStatus.FAIL, " text is not verififed");
		}
		
	}
}
