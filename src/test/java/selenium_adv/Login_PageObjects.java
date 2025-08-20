package selenium_adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_PageObjects {
	WebDriver driver;
	
	public Login_PageObjects(WebDriver driver2) {
	this.driver=driver2;
	}
	By uname=By.name("username");
	By pword=By.name("password");
	By loginbutton=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	public void enterusername(String username) {
		driver.findElement(uname).sendKeys(username);
	}
	public void enterpassword(String password) {
		driver.findElement(pword).sendKeys(password);
	}
	public void clickonlogin()
	{
		driver.findElement(loginbutton).click();
	}
	
}