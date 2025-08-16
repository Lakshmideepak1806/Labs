package seleniumpac2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc009_WindowHandeling {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/window");
	driver.findElement(By.id("home")).click();
	String pwindow=driver.getWindowHandle();
	System.out.println("Parent window:"+pwindow);
	System.out.println("url is:"+driver.getCurrentUrl());
	driver.findElement(By.id("multi")).click();
	Set<String> mwindows=driver.getWindowHandles();
	for(String cwindows:mwindows) {
		driver.switchTo().window(cwindows);
		System.out.println("url is:"+driver.getCurrentUrl());
	}
	driver.close();
	driver.quit();
}
}
