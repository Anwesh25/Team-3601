package TestCases01;

import org.testng.annotations.Test;

import BaseClass01.Baseclass_01;
import Com_PageObject_01.Login;

public class TC_01_LoginFunctionality extends Baseclass_01{
	
	public Login lg;
	@Test
	public void LoginTest() {
		lg = new Login(driver);
		
		lg.setUsername();
		lg.setpassword();
		lg.ClickLoginBtn();
		
	}
	
	
	
	
}
