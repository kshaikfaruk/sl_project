package resuablecomponent;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import objectRepo.DepostitePage;
import objectRepo.Homepage;
import objectRepo.LoginPage;
import objectRepo.Products;

public class BussinessComponent extends TechnicalComponent {
   LoginPage page;
   Products product;
   Homepage hm;
   DepostitePage Dm;
   
	 public void navigateToUrl() throws IOException{
		 navigateUrl(pro.getProperty("url"));
		 //logger.log(LogStatus.PASS,	 logger.addScreenCapture(TechnicalComponent.screenshot()));
		 logger.log(LogStatus.PASS,"application naviagated successfully url:"+pro.getProperty("url"));
	 }
	  public void verifymain_Heading() {
		  hm= new Homepage(driver);
		  hm.verifyMain_heading(hm.mainHeading, "XYZ Bank");
	  }
	  public void prefromlogin() {
		  page= new LoginPage(driver);
		  
		  page.clickonCustomerLoginButton(page.customer_LoginButton);
	  }
	  public void selectvalueindropdown() {
		  page= new LoginPage(driver);
		  page.selectvaluefromdropdown(page.scrolldown,"Harry Potter");
	  }
	  public void loginButton() {
		  page= new LoginPage(driver);
         page.clickonCustomerLoginButton(page.login_Button);
	  }
	  public void click_DepositeButton() {
		  Dm=new DepostitePage(driver);
		  Dm.clickondeposite(Dm.click_deposite);
		  
	  }
	  public void enteramountindeposite() {
		  Dm=new DepostitePage(driver);
          Dm.Enterdepositeamount(Dm.Enter_amount,Dm.Deposite_button,"20000");
	  }
	 
	  
}

