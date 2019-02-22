package com.ksrtc.Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.ksrtc.Or.SigninPage;
import com.ksrtc.helper.Helpermethods;
import com.ksrtc.setup.Setup;
import com.ksrtc.testdata.Datalibrary;

public class SigninTest extends Setup
{
	@Test
	public void TC002() throws Throwable
	{
		help.signin("kiran","kiran@123");
		
		Assert.assertEquals(SigninPage.Expected_Error_Mess,SigninPage.ERROR_MSG.getText());
	}
	@Test
	public void signinfromcommonfunction()
	{
		help.signin("kirandalavaimath123","kiran@123",signinpage.userName,signinpage.passWord);
	}
	@Test
	public void TC003() throws Throwable
	{
		help.pnrenquiry();
	}
	@Test
	public void TC004() throws Throwable
	{
		help.signin("kirandalavaimath123","kiran@123");
		if(!SigninPage.ERROR_MSG.isSelected())
		{
			SigninPage.ERROR_MSG.click();
		}
		SigninPage.Button_Submit.click();
		Thread.sleep(3000);
		Assert.assertEquals(SigninPage.Expected_Error_Mess,SigninPage.ERROR_MSG.getText());
	}
	@Test
	public void signfromexcel() throws Exception
	{
		data.readfromexcel("Login",1,0);
	}
}