package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5 {
public static void main(String[] args) {
	WebDriverManager.chromedriver();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.findElement(By.id("loginAjio")).click();
	driver.findElement(By.id("mobileNumber")).sendKeys("9550140422");
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/form/div/div[2]/input")).click();
	
}
}
