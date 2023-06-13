package config;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSetup {
 public static  WebDriver driver;
  public static Properties pro;
   public static ExtentReports log ,report;
    public static ExtentTest logger;
   public   String reportname;
 	public static String folder;
      public static TakesScreenshot sr;
      public  static JavascriptExecutor js;
  
 
	@BeforeSuite
	public void  method() throws InterruptedException{
		reportname="LocalRun"+LocalDateTime.now().toString().replace("-", "").replace(":", "").replace("T","").replace(".","");
	 File f= new File(System.getProperty("user.dir")+"/reports");
	  f.mkdir();
	   Thread.sleep(1000);
	   String folder=LocalDateTime.now().getDayOfMonth()+"_"+LocalDateTime.now().getMonthValue()+"_"+LocalDateTime.now().getYear();
	   log= new ExtentReports(System.getProperty("user.dir")+"/reports/"+reportname+".html");
	    File file= new File(System.getProperty("user.dir")+"/reports/"+folder+"/screenshots");
	    file.mkdir();
	    
	
	}
	
	@BeforeMethod
	 public void beforemethod(){
		  logger=log.startTest("test1");
		driver=openBrowser(getProperties("executionbrowser"),getProperties("testcatgory"));
		
	}
	
	
	
	@AfterMethod
	 public void aftermethod(){
		log.flush();
	}
	
	@AfterSuite
	 public void  teardown(){
		driver.quit();
	}
	
	 public  WebDriver  openBrowser(String  browser, String env){
	 if(env.equalsIgnoreCase("web")){
	switch(browser){
	case "chrome":
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
		 break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
		 break;
	case " firefox":
		WebDriverManager.firefoxdriver().setup();
		 driver= new ChromeDriver();
		 break;
	case " IE":
		WebDriverManager.iedriver().setup();
		 driver= new ChromeDriver();
		 break;
		  default:
			   System.out.println(" no browser");
	}
	 }
	
	 return driver;
}
	 
	 public    WebDriver  getDriver(){
		   WebDriver localdriver=this.driver;
		    return localdriver;
	   }
	 
	  public static String  getProperties( String key){
		  String value = " ";
		   try{
			     File f= new File(System.getProperty("user.dir")+"/config.properties");
			      FileInputStream fis= new FileInputStream(f);
			     pro= new Properties();
			     pro.load(fis);
			       value=pro.getProperty(key);
			       
		   }catch(Exception e){
			    e.printStackTrace();
		   }
		   return value;
	  }
	  
	   
}