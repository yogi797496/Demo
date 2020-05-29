package qaclickacademy.Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;




	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	By signin=By.cssSelector("a[href*='sign_in']");





	public WebElement getLogin()
	{
		return driver.findElement(signin);
		
	
} 
}

