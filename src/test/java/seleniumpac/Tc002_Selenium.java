package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc002_Selenium {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.id("APjFqb"));
	search.sendKeys("Testing methods"+Keys.ENTER);
	//search.submit();
	
// driver.findElement(By.name("btnk")).click();
// Thread.sleep(30000);
	System.out.println("Title name:"+driver.getTitle());
	
}
}
