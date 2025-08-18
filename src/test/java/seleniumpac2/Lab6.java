package seleniumpac2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?");
	//login
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.id("input-email")).sendKeys("dd4228305@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Deepu@123");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	driver.findElement(By.linkText("Components")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Monitors (2)")).click();
	Thread.sleep(3000);
	WebElement sort=driver.findElement(By.id("input-limit"));
	Select sle=new Select(sort);
	Thread.sleep(3000);
	sle.selectByContainsVisibleText("25");
	
	//Add to cart
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
	Thread.sleep(3000);
	//click on specification
	driver.findElement(By.linkText("Specification")).click();
	//Verify details present on the page
	String details=driver.findElement(By.xpath("//*[@id=\"tab-specification\"]/table")).getText();
	System.out.println(details);
	//Click on 'Add to Wish list' button.
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
	System.out.println("Product is added to wishlist is verified");
	Thread.sleep(3000);
	//Enter 'Mobile' in ' Search' text box.
	//Click on 'Search' button
	driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mobile");
	driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	//Click on 'Search in product descriptions' check box
	Thread.sleep(3000);
	driver.findElement(By.id("description")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("button-search")).click();
	//Click on link 'HTC Touch HD' for the mobile 'HTC Touch HD'
	Thread.sleep(3000);
	driver.findElement(By.linkText("HTC Touch HD")).click();
	Thread.sleep(3000);
	//Clear '1' from 'Qty' and enter '3'
	driver.findElement(By.id("input-quantity")).clear();
	driver.findElement(By.id("input-quantity")).sendKeys("3");
	//click on add to cart
	driver.findElement(By.id("button-cart")).click();
	System.out.println("You have added HTC Touch HD to your  shopping cart!");
	//Click on 'View cart' button adjacent to search button
	driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
	//Verify Mobile name added to the cart
	if(driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[2]/a")).getText().equals("HTC Touch HD")) {
		System.out.println("mobile name is added to cart");
		
	}
	else {
		System.out.println("Mobile name is not added");
	}
	Thread.sleep(3000);
	//Click on 'Checkout' button
driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();

//Click on 'My Account' dropdown

driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
//Select 'Logout' from dropdown

driver.findElement(By.linkText("Logout")).click();
//Click on 'Continue'
driver.findElement(By.linkText("Continue")).click();
	

}
}
