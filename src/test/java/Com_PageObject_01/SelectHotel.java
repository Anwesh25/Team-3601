package Com_PageObject_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectHotel {
	//Search hotel divdided in 3 parts
	public static WebDriver driver;
	public Select sc;
	public SelectHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
