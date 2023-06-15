package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public void perfromLogin(WebElement accountname, WebElement accountpassword,String username, String password) {
		TechnicalComponent.type(accountname, username);
		TechnicalComponent.type(accountpassword, password);
	}
	 public void click_loginbutton(WebElement element) {
		 TechnicalComponent.click(element);
	 }
}
