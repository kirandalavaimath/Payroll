package com.ksrtc.Tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ksrtc.Or.PNRenquirypage;
import com.ksrtc.setup.Setup;

public class PNRenquiryTest extends Setup
{
	static WebDriver driver;
	//PNRenquirypage 	pNRenquirypage;
	@Test
	public void signInTest(){
		help.signin("kirandalavaimath@gmail.com","kiran@123");
		if(signinpage.btn_LogOut.isDisplayed()){
			System.err.println("Signed In Successfully");
			Assert.assertEquals(true, signinpage.btn_LogOut.isDisplayed());
		}
	}
	@Test
	public void pnrEnquiryTest() throws Exception
	{
		pNRenquirypage.btn_PNRenquiry.click();
		pNRenquirypage.Radio_PNRenquiry.click();
		pNRenquirypage.TEXT_pnr_no.sendKeys("");
		pNRenquirypage.TEXT_mobile.sendKeys("");
		pNRenquirypage.Btn_submit.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void trasactionStatusByRefNo()
	{
		pNRenquirypage.btn_PNRenquiry.click();
		pNRenquirypage.Radio_Transactionstatus.click();
		pNRenquirypage.Radio_Ob_Refrenceby_No.isSelected();
		pNRenquirypage.TEXT_ref_no.sendKeys("123456");
		pNRenquirypage.Btn_submit_reference_no.click();
	}
	@Test
	public void transactionStatusByMobileNo() throws Exception
	{
		pNRenquirypage.btn_PNRenquiry.click();
		pNRenquirypage.Radio_Transactionstatus.click();
		pNRenquirypage.Radio_By_Mobile_No.click();
		pNRenquirypage.TEXT_mobile_no.sendKeys("9591299876");
		pNRenquirypage.Mobile_DATE_picker.click();
		Thread.sleep(2000);
		help.datePicker("2017","Jan","20");
		Thread.sleep(5000);
		pNRenquirypage.Btn_submit_by_mobile_no.click();		
	}
	@Test
	public void transactionStatusByEmailId() throws Exception
	{
		pNRenquirypage.btn_PNRenquiry.click();
		pNRenquirypage.Radio_Transactionstatus.click();
		pNRenquirypage.Radio_by_Emailid.click();
		pNRenquirypage.TEXT_email.sendKeys("kiran@gmail.com");
		pNRenquirypage.Email_DATE_picker.click();
		Thread.sleep(5000);
		help.datePicker("2016","Feb","25");
		pNRenquirypage.Btn_submit_by_email_id.click();
	}
	@Test
	public void serviceStatusByPnrStatus() throws Exception
	{
		pNRenquirypage.btn_PNRenquiry.click();
		Thread.sleep(7000);
		pNRenquirypage.Radio_Service_Status.click();
		pNRenquirypage.Text_pnr_no.sendKeys("1234567890");
		pNRenquirypage.btn_service_By_PNR_NO.click();
		
	}
}
