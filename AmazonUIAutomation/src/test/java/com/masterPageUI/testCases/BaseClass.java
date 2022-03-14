package com.masterPageUI.testCases;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static String url="https://demo.guru99.com/v4/";
	
	
	public static String un="mngr389806";
public static String pwd="bYpYhat";
public static ChromeDriver driver;
@BeforeClass
public void openBrowser() 
{
	System.setProperty("webdriver.chrome.driver", System .getProperty("user.dir")+"//drivers//chromedriver.exe");
driver= new ChromeDriver();
driver.get(url);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
@AfterClass
public void closeBrowser() {
	driver.quit();
}

}

