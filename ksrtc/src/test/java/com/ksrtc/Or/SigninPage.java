package com.ksrtc.Or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ksrtc.setup.Setup;

public class SigninPage extends Setup
{
	    static public String Expected_Error_Mess="Login incorrect. Please try again";
		WebDriver driver;
	    public SigninPage(WebDriver driver)
	    {
	    	this.driver=driver;
	    }
	    @FindBy(partialLinkText="Sign In")
		public static WebElement Link_Signin;
		
		@FindBy(id="userName") 
		public WebElement userName;
		
		@FindBy(id="password")
		public WebElement passWord;
		
		@FindBy(name="TermsConditions")
		public WebElement checkbox_TandC;
		
		@FindBy(id="submitBtn")
		static public WebElement Button_Submit;
		
		@FindBy(id="errorMsg")
		static public WebElement ERROR_MSG;
		
		// Logout
		
		@FindBy(xpath="//a[text()='Logout']")
		 public WebElement btn_LogOut;
		
		
		
		
}
