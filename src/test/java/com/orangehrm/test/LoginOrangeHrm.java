package com.orangehrm.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

import com.orangehrm.pages.Login_pagefactory;
import com.orangehrm.utilities.ExcelUtiles;

import com.orangehrm.utilities.ScreenshotUtiles;

public class LoginOrangeHrm extends BaseTest {
    
    static String projectpath = System.getProperty("user.dir");

    @Test(dataProvider="logindata",enabled = false)
    public void verifylogin(String username, String password) throws IOException {
        
        // Extent Report Test
        test = extent.createTest("Login with the user: " + username);

        // ✅ Use constructor of Login_pagefactory instead of redeclaring driver
        Login_pagefactory obj = new Login_pagefactory(driver);
        
        obj.enterusername(username);
        obj.enterpassword(password);
        obj.clickonlogin();
        
        String actualtitle = driver.getTitle();
        
        if (actualtitle.equalsIgnoreCase("OrangeHRM")) {   // ✅ fix title
            test.pass("Login Successful and title matched: " + actualtitle);
        } else {
            String screenpath = ScreenshotUtiles.Capture(driver, "Login_Failed_" + username);
            test.fail("Login Unsuccessful. Title not matched: " + actualtitle)
                .addScreenCaptureFromPath(screenpath);
        }
    }
    
    @Test
    public void question1_google() throws IOException
    {
  	  navigateurl("https://www.google.com/");
  	 test=extent.createTest("Verify the title of the google page");
  	  String actualtitle=driver.getTitle();
  	  if(actualtitle.equalsIgnoreCase("Google"))
  	  {
  		  test.pass("Google title is matched");
  	  }
  	  else
  	  {
  		 test.fail("google title is not matched");
  		 String screenpath = ScreenshotUtiles.Capture(driver,"title is not matched");
         test.fail("Login Unsuccessful. Title not matched: " + actualtitle)
             .addScreenCaptureFromPath(screenpath);
  		 
  	  }
    }
    @Test(dataProvider="logindata",enabled  =false)
    public void question2_Login(String username,String password) throws IOException {
    	 Login_pagefactory obj = new Login_pagefactory(driver);
    	 test=extent.createTest("Verify the login is successfull");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      navigateurl("https://the-internet.herokuapp.com/login");
      obj.enterusername(username);
      obj.enterpassword(password);
      obj.clickonlogin();
   	  WebElement logintext=driver.findElement(By.xpath("/html/body/div[1]/div/div"));
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	  if(logintext.getText().equals(" You logged into a secure area! ")) {
   		  System.out.println("Login successfull");
   		  test.pass("Googile title is matched");
   	  }
   	  else {
   		  System.out.println("Login unsuccessfull");
   		 String screenpath=ScreenshotUtiles.Capture(driver, "Title mismatched");
 		  test.fail("Google title is not matched:"+logintext)
 		  .addScreenCaptureFromPath(screenpath);
   	  }
    }
    @Test(enabled=false)
    public void question3_productdetails() {
    	navigateurl("https://www.amazon.in/");
    	 driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")).click();
   	  driver.findElement(By.name("field-keywords")).sendKeys("Laptop");
   	  driver.findElement(By.id("nav-search-submit-button")).click();
   	  WebElement product1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span"));
   	  System.out.println("1st Product:"+product1.getText());
   	  WebElement product2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span"));
   	  System.out.println("2st Product:"+product2.getText());
   	  WebElement product3=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span"));
   	  System.out.println("3st Product:"+product3.getText());
   	  WebElement product4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span"));
   	  System.out.println("4st Product:"+product4.getText());
   	  WebElement product5=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span"));
   	  System.out.println("5st Product:"+product5.getText());
    }
    @Test(enabled=false)
    public void question4_Dropdown() throws IOException {
    	navigateurl("https://www.selenium.dev/selenium/web/web-form.html");
    	 test=extent.createTest("Verify the option is correct or not");
    	 WebElement sort=driver.findElement(By.name("my-select"));
   	  Select sle=new Select(sort);
   	  sle.selectByIndex(1);
   	  String selectedText = sle.getFirstSelectedOption().getText();
   	  WebElement verify=driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select/option[2]"));
   	  if (verify.getText().equals(selectedText)) {
   		    System.out.println("Correct option is selected.");
   		    test.pass("correct option is selected");
   		} else {
   		    System.out.println("Selected option is incorrect.");
   		 String screenpath=ScreenshotUtiles.Capture(driver, "Title mismatched");
		  test.fail("option is not matched:"+verify)
		  .addScreenCaptureFromPath(screenpath);
   		}
    }
    @Test(enabled = false)
    public void question5_Alertpopup() throws IOException {
    	navigateurl("https://the-internet.herokuapp.com/javascript_alerts");
   	 test=extent.createTest("Verify the option is correct or not");
    	 driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
    	 Alert alert=driver.switchTo().alert();
    	 alert.accept();
    	  WebElement text=driver.findElement(By.id("result"));
    	  if(text.getText().equals("You successfully clicked an alert")) {
    		  System.out.println("Successfull message is verifed");
    	  }
    	  else {
    		  System.out.println("successfull message is not verified");
    		  String screenpath=ScreenshotUtiles.Capture(driver, "successfull message");
    		  test.fail("option is not matched:"+text)
    		  .addScreenCaptureFromPath(screenpath);
    	  }
    }
    @Test(enabled=false)
    public void question6_Checkbox() throws IOException {
    	navigateurl("https://the-internet.herokuapp.com/checkboxes");
      	 test=extent.createTest("Verify the checkbox is checked or not");
    	  driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
    	  WebElement checked=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
    	  if(checked.isSelected()) {
    		  System.out.println("verified");
    	  }
    	  else {
    		  System.out.println("not verified");
    		  String screenpath=ScreenshotUtiles.Capture(driver, "checkbox isnt checked");
    		  test.fail("option is not matched:"+checked)
    		  .addScreenCaptureFromPath(screenpath);
    	  }
    }
    @Test(enabled=false)
    public void question7_WebTableExtraction() throws IOException {
    	navigateurl("https://the-internet.herokuapp.com/tables");
     	 test=extent.createTest("Verify the table is extracted or not");
    	 List<WebElement> data=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
    	 for(int i=0;i<data.size();i++) {
    		 WebElement row=data.get(i);
    		 String firstName = row.findElement(By.xpath("./td[2]")).getText();
             String lastName = row.findElement(By.xpath("./td[1]")).getText();
    		 System.out.println(firstName+" "+lastName);
    		   if (firstName.equalsIgnoreCase("Jason")) {
                   String email = row.findElement(By.xpath("./td[3]")).getText();
                   System.out.println("Email of Jason: " + email);
               }
    		   else {
    			   System.out.println("name is not verified");
    			   String screenpath=ScreenshotUtiles.Capture(driver, "name is not checked");
    	    		  test.fail("option is not matched:"+firstName)
    	    		  .addScreenCaptureFromPath(screenpath);
    			  
    		   }
    	 }
    }
    @Test(enabled=false)
    public void question8_windowHandaling() throws InterruptedException {
    	navigateurl("https://the-internet.herokuapp.com/windows");
    	  driver.findElement(By.linkText("Click Here")).click();
    	  System.out.println("Child Title :"+driver.getTitle()+"Child Window url : " + driver.getCurrentUrl());//child title
    	 Thread.sleep(3000);
    	  String parent=driver.getWindowHandle();
    	  driver.switchTo().window(parent);
    	  System.out.println("Parent window:"+parent);
    	  System.out.println("Parent Title :"+driver.getTitle()+" Parent url is:"+driver.getCurrentUrl());
    }
    @Test(enabled=false)
    public void question9_Screenshot() throws IOException {
    	navigateurl("https://www.wikipedia.org/");
    	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 String dest=projectpath+"\\Homepage2.png";
    	  File destination=new File(dest);
    	  FileUtils.copyFile(src, destination);
    	  System.out.println("Screenshot saved as homepage.png");
    }
    @DataProvider()
    public Object[][] logindata() throws IOException {
        String excelpath = projectpath + "\\src\\test\\resources\\Testdata\\data.xlsx";
        return ExcelUtiles.getData(excelpath, "Sheet1");
    }
}