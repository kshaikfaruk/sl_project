package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import resuablecomponent.BussinessComponent;

public class verifyproductnameincheckoutpage  extends BussinessComponent{
	@Test
 public void verifyproductNameincheckout() throws Exception {
		 navigateToUrl();
		 applogin();
		 verifyproduct();
		 verifyaddcartvalue();
		verifyproductName();
		
 }
	
	
}
	


