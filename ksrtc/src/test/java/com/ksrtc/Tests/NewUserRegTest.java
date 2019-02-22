package com.ksrtc.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.ksrtc.Or.NewUserRegPage;

public class NewUserRegTest 
{
	@Test
	public void newRegistration()
	{
		//System.setProperty("webdriver.firefox.marionette","D://Testing Softwares");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/oprs-web/user/add.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		NewUserRegPage.username(driver).sendKeys("kirandalavaimath@gmail.com");
		NewUserRegPage.fullname(driver).sendKeys("kiran kumar");
		NewUserRegPage.mobileNo(driver).sendKeys("9591299876");
		NewUserRegPage.add(driver).click();
	}
	}
