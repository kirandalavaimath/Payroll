package com.ksrtc.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.lift.match.SelectionMatcher;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ksrtc.Or.PNRenquirypage;
import com.ksrtc.Or.SigninPage;
import com.ksrtc.commonfuctions.CommonFunctions;
import com.ksrtc.setup.Setup;
import com.ksrtc.testdata.Datalibrary;

public class Helpermethods extends Setup
{
WebDriver driver;
//SigninPage signIn;
String s;
//PNRenquirypage pNRenquirypage;
public Helpermethods(WebDriver driver) 
{
	this.driver=driver;
}
public void signin(String uun,String ppwd)
{	
	//signIn=PageFactory.initElements(driver,SigninPage.class);
	signinpage.Link_Signin.click();
	signinpage.userName.sendKeys(uun);
	signinpage.passWord.sendKeys(ppwd);
	/*if(!signIn.checkbox_TandC.isSelected())
	{
		signIn.checkbox_TandC.click();
	}*/
	signinpage.Button_Submit.click();
}
public void signin(String un,String pwd, WebElement element1,WebElement element2)
{
	signinpage=PageFactory.initElements(driver,SigninPage.class);
	commonfunctions=PageFactory.initElements(driver,CommonFunctions.class);
	signinpage.Link_Signin.click();
	commonfunctions.enterValue(un, element1);
	commonfunctions.enterValue(pwd, element2);
	commonfunctions.clickOnElement(signinpage.Button_Submit);
	
	}
public void pnrenquiry()
{
	pNRenquirypage=PageFactory.initElements(driver, PNRenquirypage.class);
	pNRenquirypage.btn_PNRenquiry.click();
	}
public void datePicker(String year,String month,String day)
{
	pNRenquirypage=PageFactory.initElements(driver, PNRenquirypage.class);
	Select year1=new Select(pNRenquirypage.year);
	year1.selectByValue(year);
	Select month1=new Select(pNRenquirypage.month);
	month1.selectByVisibleText(month);
	List<WebElement> list=pNRenquirypage.dayy;
	//Iterator<WebElement> list= pNRenquirypage.dayy.iterator();
	for(WebElement l:list)
	{
		try{
		if(l.getText().equals(day))
				{
			l.click();
				}
		}
		catch (org.openqa.selenium.UnhandledAlertException e) {
			// TODO: handle exception
		}
	}
	//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody//*[.='"+day+"']/a")).click();
}
}
//diffrence b/w helper methods and common methods;