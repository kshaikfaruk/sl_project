package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resuablecomponent.TechnicalComponent;

public class Homepage extends TechnicalComponent {

	 public Homepage(WebDriver driver){
		 driver=this.driver;
		 PageFactory.initElements(driver, this);
	 }
	  @FindBy(xpath="//input[@name='q']")
	   public WebElement element;
	  
	   public void entervalue( String text){
		   try{
			   TechnicalComponent.type(element,text);
		   }catch(Exception e){
			    e.printStackTrace();
		   }
	   }
}
