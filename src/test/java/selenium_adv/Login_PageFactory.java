package selenium_adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageFactory {
//WebDriver driver;
	
//	public Login_PageFactory(WebDriver driver2) {
//	this.driver=driver2;
//	}

	//By uname=By.name("username");
	@FindBy(name="username")
	WebElement uname;
	//By pword=By.name("password");
	@FindBy(name="password")
	WebElement pword;
	//By loginbutton=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement loginbutton;
	

	public void enterusername(String username) {
		uname.sendKeys(username);
	}
	public void enterpassword(String password) {
		pword.sendKeys(password);
	}
	public void clickonlogin()
	{
		loginbutton.click();
	}
	

}
