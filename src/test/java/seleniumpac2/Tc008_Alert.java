package seleniumpac2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc008_Alert {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/alert");
	driver.findElement(By.id("accept")).click();
	Alert salert=driver.switchTo().alert();
	System.out.println("The Message is:"+salert.getText());
	salert.accept();
	
	//Alert 2
	driver.findElement(By.id("confirm")).click();
	Alert calert=driver.switchTo().alert();
	System.out.println("Confirm alert:"+calert.getText());
	Thread.sleep(3000);
	calert.dismiss();
	driver.findElement(By.id("prompt")).click();
	Alert palert=driver.switchTo().alert();
	System.out.println("Prompt alert:"+palert.getText());
	palert.sendKeys("Deepu");
	palert.accept();
}
}
