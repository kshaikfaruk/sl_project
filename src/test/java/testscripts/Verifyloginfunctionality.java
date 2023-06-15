package testscripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.BussinessComponent;

public class Verifyloginfunctionality extends BussinessComponent {
    @Test
	public void verifylogin() {
    	try {
		 navigateToUrl();
		 applogin();
		 logger.log(LogStatus.PASS,"testcase is passed");
	}catch(Exception e) {
		logger.log(LogStatus.FAIL,"testcase is failed");
	}
}
}
