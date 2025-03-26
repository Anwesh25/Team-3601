package TestCases01;

import org.testng.annotations.Test;

import BaseClass01.Baseclass_01;
import Com_PageObject_01.Login;
import Com_PageObject_01.SearchHotel;

public class TC_02_SearchHotel extends Baseclass_01{
	public Login lg;
	public SearchHotel sh;
	@Test
	public void SearchHotel01() {
		lg = new Login(driver);
		
		lg.setUsername();
		lg.setpassword();
		lg.ClickLoginBtn();
		
		
		sh = new SearchHotel(driver);
		sh.setLocation();
		sh.setRooms();
		sh.setDateIn();
		sh.setDateout();
		sh.setAdultroom();
		sh.clickSearch();
		
		
	}
	
	

}
