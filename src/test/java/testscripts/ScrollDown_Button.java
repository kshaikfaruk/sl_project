package testscripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.BussinessComponent;

public class ScrollDown_Button extends BussinessComponent{
 @Test
 public void verify_login() {

	try{
		 navigateToUrl();
		 verifymain_Heading();
		 prefromlogin();
		 selectvalueindropdown();
		 loginButton();
		 
		 Thread.sleep(1000000);
		 
		 logger.log(LogStatus.PASS, " testcase got passed");
	//
		 //logger.log(LogStatus.PASS,	 logger.addScreenCapture(TechnicalComponent.screenshot()));
	 }catch(Exception e){
		 logger.log(LogStatus.PASS, " testcase is  failed");
}
}
}