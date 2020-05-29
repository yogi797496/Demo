package qaclickacademy.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main { 
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\yogendra\\Desktop\\New folder\\setup\\chromedriver.exe");
 WebDriver driver=new ChromeDriver(); 
 driver.manage().window().maximize();  
 driver.get("http://qaclickacademy.com/");
 LandingPage l=new LandingPage(driver);  
 l.getLogin().click(); 
 LoginPage lp=new LoginPage(driver); 
 lp.getEmail(); 
 lp.getPassword(); 
 lp.getLogin();
 lp.forgotPassword().click();  
 ForgotPassword fp=new ForgotPassword(driver); 
 Thread.sleep(2000);
 fp.getEmail().sendKeys("abc@gmail.com"); 
 fp.sendMeInstructions().click();
 
	} 
}
