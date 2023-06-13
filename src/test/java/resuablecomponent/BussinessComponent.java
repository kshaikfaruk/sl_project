package resuablecomponent;

import objectRepo.Homepage;

public class BussinessComponent extends TechnicalComponent {
   Homepage page;
   
	 public void navigateToUrl(){
		 navigateUrl(pro.getProperty("url"));
	 }
	  public void enterdateils(String text){
		   page= new Homepage(driver);
		 page. entervalue(text);
	  }
}
