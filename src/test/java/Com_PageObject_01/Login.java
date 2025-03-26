package Com_PageObject_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	// lOgin page is divided in 3 parts
	
	public static WebDriver driver;  //remote Driver
	
	public Login(WebDriver driver) { // Local Driver
		this.driver = driver; // amiguty issues
		PageFactory.initElements(driver, this);
	}
	
	//identify the WebElement
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnlogin;
	
	
	//Create an Actions
	
	public void setUsername() {
		txtusername.sendKeys("anwesh26");
	}
	
	public void setpassword() {
		txtpassword.sendKeys("anwesh26#");
	}
	
	public void ClickLoginBtn() {
		btnlogin.click();
	}
	
	

}
