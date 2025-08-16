package seleniumpac;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc003_Seleinum {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/");
	String title=driver.getTitle();
	if(title.equals("OpenCart - Open Source Shopping Cart Solution")) {
		System.out.println("Title is verified");
	}
	else {
		System.out.println("Invalid Title");
	}
	WebElement register = driver.findElement(By.linkText("REGISTER"));
	register.click();
	
	//navigating to another url
	driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
	System.out.println("url:"+driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.navigate().back();
	
	System.out.println("url:"+driver.getCurrentUrl());
	driver.navigate().forward();
	System.out.println("url:"+driver.getCurrentUrl());
	
	
}
}
