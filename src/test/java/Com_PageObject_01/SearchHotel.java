package Com_PageObject_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	
//	Search hotel divdided in 3 parts
	public static WebDriver driver;
	public Select sc;
	public SearchHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//identify the WebElement
	
	@FindBy(id="location")
	WebElement drpLocation;
	
	@FindBy(id="room_nos")
	WebElement drpRooms;
	
	@FindBy(id="datepick_in")
	WebElement txtDateIn;
	
	@FindBy(id="datepick_out")
	WebElement txtDateout;

	@FindBy(id="adult_room")
	WebElement drpAdultperRoom;
	
	@FindBy(id="Submit")
	WebElement btnsearch;
	
	//create Actions
	public void setLocation() {
		sc = new Select(drpLocation);
		sc.selectByIndex(3);
	}
	
	public void setRooms() {
		sc = new Select(drpRooms);
		sc.selectByIndex(2);
	}
	
	public void setDateIn() {
		txtDateIn.sendKeys("12/03/2025");
	}
	
	public void setDateout() {
		txtDateout.sendKeys("14/03/2025");
	}
	
	public void setAdultroom() {
		sc = new Select(drpAdultperRoom);
		sc.selectByIndex(0);
	}
	
	public void clickSearch() {
		btnsearch.click();
	}
	
}
