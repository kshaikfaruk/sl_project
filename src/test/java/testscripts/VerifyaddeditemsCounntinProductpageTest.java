package testscripts;

import org.testng.annotations.Test;

import resuablecomponent.BussinessComponent;

public class VerifyaddeditemsCounntinProductpageTest  extends BussinessComponent{

	@Test
 public void verifycart() throws Exception {
		 navigateToUrl();
		 applogin();
		 verifyproduct();
		 verifyaddcartvalue();
		
		
 }
	
	
}
