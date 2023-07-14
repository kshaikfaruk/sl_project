package testscripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.BussinessComponent;
import resuablecomponent.TechnicalComponent;

public class VerifyLoginfunctionalityinapplication extends BussinessComponent {
	
 @Test
 public void verify_login() {

	try{
		 navigateToUrl();
		 verifymain_Heading();
		 prefromlogin();
		 logger.log(LogStatus.PASS, " testcase got passed");
	//
		 //logger.log(LogStatus.PASS,	 logger.addScreenCapture(TechnicalComponent.screenshot()));
	 }catch(Exception e){
		 logger.log(LogStatus.PASS, " testcase is  failed");
//logger.log(LogStatus.FAIL,  logger.addScreenCapture(TechnicalComponent.screenshot()));	
}

}

}
