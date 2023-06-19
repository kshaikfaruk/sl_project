package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.TechnicalComponent;

public class LoginPage extends TechnicalComponent {
	
	public LoginPage(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	public WebElement accountname;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement accountpassword;
	
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement login_button;
    
	@FindBy(xpath="//div[contains(text(),'Products')]")
	public WebElement heading;

	public void perfromLogin(WebElement accountname, WebElement accountpassword,String username, String password) {
		TechnicalComponent.type(accountname, username);
		TechnicalComponent.type(accountpassword, password);
	}
	 public void click_loginbutton(WebElement element) {
		 TechnicalComponent.click(element);
	 }
	 public void clicked_button(WebElement element) {
		 TechnicalComponent.click(element);
	 }
	 public void verifyproductheading(WebElement element) {
		String text= TechnicalComponent.gettext(element);
		if(text.equals("Products")) {
			logger.log(LogStatus.PASS, "text is verified"+text);
		}
	 }
	
}

