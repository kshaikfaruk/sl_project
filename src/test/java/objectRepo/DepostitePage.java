package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resuablecomponent.TechnicalComponent;

public class DepostitePage  extends TechnicalComponent{
	public DepostitePage(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver,this);
	}
    @FindBy(xpath="//button[@ng-click=\"deposit()\"]")
    public WebElement click_deposite;
    
    @FindBy(xpath="//input[@placeholder='amount']")
    public WebElement Enter_amount;
    
    @FindBy(xpath="//button[@type='submit']")
    public WebElement Deposite_button;
    
    public void clickondeposite(WebElement element) {
    	TechnicalComponent.click(element);
    }
    public void Enterdepositeamount(WebElement textfieldelement,WebElement depositebutton,String text) {
    	TechnicalComponent.type(textfieldelement, text );
    	TechnicalComponent.click(depositebutton);
    }
    
    
}
