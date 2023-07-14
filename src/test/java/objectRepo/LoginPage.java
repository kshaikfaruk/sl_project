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
	 @FindBy(xpath="//button[contains(text(),'Customer Login')]")
	 public WebElement customer_LoginButton;
	 
	 @FindBy(xpath="//select[@name=\'userSelect\']")
	 public WebElement scrolldown;
	 
	 @FindBy(xpath="//button[contains(text(),'Login')]")
	 public WebElement login_Button;

	 
	  public void clickonCustomerLoginButton(WebElement element) {
		  TechnicalComponent.waittopageload(element);
		  TechnicalComponent.click(element);	  
	  }
	 public void selectvaluefromdropdown(WebElement element,String text) {
		 TechnicalComponent.Handledropdown(element, text);
		 
	 }

	
	 

	
		
	 }
	

