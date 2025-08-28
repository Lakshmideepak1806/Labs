package com.orangehrm.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

import com.orangehrm.pages.Login_pagefactory;
import com.orangehrm.utilities.ExcelUtiles;

import com.orangehrm.utilities.ScreenshotUtiles;

public class LoginOrangeHrm extends BaseTest {
    
    static String projectpath = System.getProperty("user.dir");

    @Test(dataProvider="logindata")
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
    
    @DataProvider
    public Object[][] logindata() throws IOException {
        String excelpath = projectpath + "\\src\\test\\resources\\Testdata\\data.xlsx";
        return ExcelUtiles.getData(excelpath, "Sheet1");
    }
}