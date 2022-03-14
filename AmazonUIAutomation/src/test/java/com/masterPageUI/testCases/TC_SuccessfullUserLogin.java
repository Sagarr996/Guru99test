package com.masterPageUI.testCases;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.masterPageUI.Utilities.CaptureScreenshot;
import com.masterPageUI.pageObjects.UserLogin;
public class TC_SuccessfullUserLogin extends BaseClass  
{
	UserLogin ul;
	CaptureScreenshot captureS;
@Test
public void loginTest() 
{
	ul=new UserLogin();
	captureS=new CaptureScreenshot();
     ul.enterUsername();
     ul.enterPassword();
	 ul.tapLoginButton();
	String loginTitleName = driver.getTitle();		
	if(loginTitleName=="/Gu33ru99 Bank Manager HomePage")
	{
		Reporter.log("Logged in successfully");
	}
	else
	{
		Reporter.log("Unable to login please refer the attached screenshot");
		TakesScreenshot screenshot=(TakesScreenshot)driver;//casting
		File takenscreenshotfile=screenshot.getScreenshotAs(OutputType.FILE);
		captureS.captureSS(takenscreenshotfile,ul.LoginFailedSSLocation );
	}
	Assert.assertEquals(loginTitleName, "/Gu33ru99 Bank Manager HomePage");
    }
    @Test
    public void verifyusername()
    {   
    String MasterID= ul.username.getText();
	if(MasterID=="/Gu33ru99 Bank Manager HomePage")
	{
	Reporter.log("Logged in successfully");
	}
	else
	{
		Reporter.log("Unable to verify manager ID please refer the attached screenshot");
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File takenscreenshotfile=screenshot.getScreenshotAs(OutputType.FILE);
		captureS.captureSS(takenscreenshotfile,ul.ManagerIDVerficationSSFailedLocation );
	}
	Assert.assertEquals(MasterID, "Manger Id : mngr389806");
}
}
