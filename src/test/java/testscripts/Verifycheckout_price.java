package testscripts;

import org.testng.annotations.Test;

import resuablecomponent.BussinessComponent;

public class Verifycheckout_price extends BussinessComponent{
	@Test
	public void vrify_price()throws Exception {
	
	 navigateToUrl();
	 applogin();
	 verifyproduct();
	 verifyaddcartvalue();
	 verifyproduct_Price();
	 
    
	}
	}


