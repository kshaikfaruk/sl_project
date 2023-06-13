package resuablecomponent;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
