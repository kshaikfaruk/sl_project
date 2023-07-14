package testscripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resuablecomponent.BussinessComponent;

public class Verify_depositeis_successfullytestinapplication extends BussinessComponent {
	@Test
	public void verifydepositeis_suucess() {
try {
	 navigateToUrl();
	 verifymain_Heading();
	 prefromlogin();
	 selectvalueindropdown();
	 loginButton();
	 click_DepositeButton();
	 enteramountindeposite();
	 
	 logger.log(LogStatus.PASS, " testcase got passed");

	
}catch(Exception e) {
	logger.log(LogStatus.PASS, " testcase is Failed");
	
}
}
}
