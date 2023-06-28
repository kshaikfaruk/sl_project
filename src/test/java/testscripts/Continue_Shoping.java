package testscripts;

import org.testng.annotations.Test;

import resuablecomponent.BussinessComponent;

public class Continue_Shoping extends BussinessComponent{
	@Test
 public void verifyproductNameincheckout() throws Exception {
		 navigateToUrl();
		 applogin();
		 verifyproduct();
		 verifyaddcartvalue();
		verifyproductName();
		verifyproduct_Continue_Shoping();
		
		
 }
	
		

}
