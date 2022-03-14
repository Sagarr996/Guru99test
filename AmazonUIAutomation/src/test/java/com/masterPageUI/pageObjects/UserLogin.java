package com.masterPageUI.pageObjects;
import java.io.File;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.masterPageUI.Utilities.FetechDataFromSheet;
import com.masterPageUI.testCases.BaseClass;
public class UserLogin {
	public File LoginFailedSSLocation= new File("D:\\SAGAR\\Eclipse Workplace\\AmazonUIAutomation\\FailureScreenshots\\LoginfailedScreenshot.png");
	public File ManagerIDVerficationSSFailedLocation = new File("D:\\SAGAR\\Eclipse Workplace\\AmazonUIAutomation\\FailureScreenshots\\ManagerIDFailedScreenshot.png");
	//FetechDataFromSheet fdfs=new FetechDataFromSheet();
	public UserLogin()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
	private WebElement usernameTextField;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	private WebElement passwordTextField;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	private WebElement LoginButton;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
	public WebElement username;
	public void enterUsername()
	{
	usernameTextField.sendKeys(BaseClass.un);
	
	}
	public void enterPassword() {
	passwordTextField.sendKeys(BaseClass.pwd);
	}
	public void tapLoginButton() {
	LoginButton.click();
	}
	}
