package com.ksrtc.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.ksrtc.Or.PNRenquirypage;
import com.ksrtc.Or.SigninPage;
import com.ksrtc.commonfuctions.CommonFunctions;
import com.ksrtc.helper.Helpermethods;
import com.ksrtc.testdata.Datalibrary;

public class Setup extends Log4j
{	
	 public WebDriver driver;
	public SigninPage signinpage;
	public Helpermethods help;
	public PNRenquirypage pNRenquirypage;
	public Datalibrary data;
	public CommonFunctions commonfunctions;
	@BeforeMethod
	public void setup() throws Exception
	{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ksrtc.in/oprs-web/");
	getlogger().info("browser launched");
	System.out.println("browser launched");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	signinpage=PageFactory.initElements(driver,SigninPage.class);
	help=PageFactory.initElements(driver,Helpermethods.class);
	pNRenquirypage=PageFactory.initElements(driver, PNRenquirypage.class);
	data=PageFactory.initElements(driver,Datalibrary.class);
	commonfunctions=PageFactory.initElements(driver,CommonFunctions.class);
    }
	@AfterMethod
	public void close() throws Exception
	{
		Thread.sleep(7000);
		driver.close();
	}
}
       