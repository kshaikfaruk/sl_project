package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.BussinessComponent;
import resuablecomponent.TechnicalComponent;

public class Verifyurl  extends BussinessComponent{
 @Test
  public void verifyhomepage() throws IOException{
	 try{
		 navigateToUrl();
		 enterdateils("text");
		 logger.log(LogStatus.PASS, " testcase got passed");
	logger.log(LogStatus.PASS,	 logger.addScreenCapture(TechnicalComponent.screenshot()));
	 }catch(Exception e){
logger.log(LogStatus.FAIL,  logger.addScreenCapture(TechnicalComponent.screenshot()));	
}
 }
}
