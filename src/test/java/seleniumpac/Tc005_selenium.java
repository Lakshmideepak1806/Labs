package seleniumpac;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc005_selenium {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> alllinks=driver.findElements(By.tagName("a"));
	System.out.println("Total Links present in amazon.in: "+alllinks.size());
	for(WebElement link:alllinks) {
		System.out.println("The link is:"+link.getAttribute("href"));
		System.out.println("the link is:"+link.getText());
	}
}
}
