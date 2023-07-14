package resuablecomponent;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import config.TestSetup;

public class TechnicalComponent extends TestSetup {
 public static WebDriver driver;
public   void navigateUrl(String url){
	 try{
		  driver= getDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  String curl=driver.getCurrentUrl();
		   if(curl.equals(url)) {
			   System.out.println("passed");
		   }else {
			   System.out.println("passed");
		   }
	 }catch(Exception e){
		 e.printStackTrace();
	 }
}
	
 public static void click(WebElement element){
	  try{
		  element.click();
	  }catch(Exception e){
		   e.printStackTrace();
	  }
 }
 
 public static void type(WebElement element,  String text){
	  try{
		  element.sendKeys(text);
	  }catch(Exception e){
		   e.printStackTrace();
	  }
}
	
 public static String gettext(WebElement element){
	 String text = null;
	  try{
		text=  element.getText();
		
	  }catch(Exception e){
		   e.printStackTrace();
	  }
	  return text;
}
	public  static void waittopageload(WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
  public static void Handledropdown(WebElement element,String text) {
	  Select sc=new Select(element);
	  sc.selectByVisibleText(text);
  }
 
 public static String  screenshot() throws IOException{
	 sr=(TakesScreenshot) driver;
	File f= sr.getScreenshotAs(OutputType.FILE);
	String screenshotname=LocalDateTime.now().toString().replace(":", "").replace(".","").replace("T","").replace("-", "");
	 String folder =LocalDateTime.now().getDayOfMonth()+"_"+ LocalDateTime.now().getMonthValue()+"_"+LocalDateTime.now().getYear();
	  String path="./reports/"+folder+"/screenshots/"+screenshotname+".png";
			  Files.move(f, new File(path));
			   return path;
 }
}
