package resuablecomponent;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import objectRepo.Homepage;
import objectRepo.LoginPage;
import objectRepo.Products;

public class BussinessComponent extends TechnicalComponent {
   LoginPage page;
   Products product;
   
   
	 public void navigateToUrl() throws IOException{
		 navigateUrl(pro.getProperty("url"));
		 //logger.log(LogStatus.PASS,	 logger.addScreenCapture(TechnicalComponent.screenshot()));
		 logger.log(LogStatus.PASS,"application naviagated successfully url:"+pro.getProperty("url"));
	 }
	  public void applogin() throws IOException{
		   page= new LoginPage(driver);
		   page.perfromLogin(page.accountname,page.accountpassword,pro.getProperty("username"), pro.getProperty("password"));
		  //logger.log(LogStatus.PASS,	 logger.addScreenCapture(TechnicalComponent.screenshot()));
		   page.click_loginbutton(page.login_button);
		   logger.log(LogStatus.PASS,"login successfully with username"+pro.getProperty("username")+" and  with password"+pro.getProperty("password"));
	  }
	  public void verifyproduct() {
		  page.verifyproductheading(page.heading);
	  }
	  
	  public void verifyaddcartvalue() {
		  product= new Products(driver);
		  product.addtocart(product.addtocart);
		  product.verifyaddeditemsvalue(product.addeditemscount);
	  }
}
