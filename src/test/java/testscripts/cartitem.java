package testscripts;

import org.testng.annotations.Test;

import resuablecomponent.BussinessComponent;
	@Test
	public class cartitem  extends BussinessComponent{

		public void verifycart() throws Exception {
			 navigateToUrl();
			 applogin();
			 verifyproduct();
			 verifyaddcartvalue();
		    verifycart();
		
			
		}

			
		}

