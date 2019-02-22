package com.ksrtc.Or;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class PNRenquirypage 
{
	WebDriver driver;
	public PNRenquirypage(WebDriver driver)
	{
	this.driver=driver;	
	}
	@FindBy(xpath="html/body/div[4]/div/a[2]")
	public WebElement btn_PNRenquiry;
	//PNR enquiry
	@FindBy(id="isTranxSuccess_1")
	public WebElement Radio_PNRenquiry;
	@FindBy(id="pnrPrefixWithTktNo")
	public WebElement TEXT_pnr_no;
	@FindBy(id="mobileNo")
	public WebElement TEXT_mobile;
	@FindBy(id="searchBtn")
	public WebElement Btn_submit;
	//Transaction Status
	@FindBy(id="isTranxSuccess_2")
	public WebElement Radio_Transactionstatus;
	//By OB Reference no
	@FindBy(id="TransactionStatus_1")
	public WebElement Radio_Ob_Refrenceby_No;
	@FindBy(id="bankRefNo")
	public WebElement TEXT_ref_no;
	@FindBy(xpath="(//*[@id='searchBtn'])[4]")
	public WebElement Btn_submit_reference_no;
	
	//input[@id='searchBtn']
	//By Mobile No
	@FindBy(id="TransactionStatus_2")
	public WebElement Radio_By_Mobile_No;
	@FindBy(id="tranxMobileNo")
	public WebElement TEXT_mobile_no;
	@FindBy(id="tranxDate")
	public WebElement Mobile_DATE_picker;
	@FindBy(xpath="(.//*[@id='searchBtn'])[position()=2]")
	public WebElement Btn_submit_by_mobile_no;
	//Date Picker
	@FindBy(xpath="//*[@id='ui-datepicker-div']//div/select[1]")
	public WebElement month;
	@FindBy(xpath="//*[@id='ui-datepicker-div']//div/select[2]")
	public WebElement year;
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody//td/a")
	public List<WebElement> dayy;
	//@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr")
	//public WebElement day;
	//By email No
	@FindBy(id="TransactionStatus_3")
	public WebElement Radio_by_Emailid;
	@FindBy(id="email")
	public WebElement TEXT_email;
	@FindBy(id="tranxDate1")
	public WebElement Email_DATE_picker;
	@FindBy(xpath="(.//*[@id='searchBtn'])[position()=3]")
	public WebElement Btn_submit_by_email_id;
	//service status
	@FindBy(id="isTranxSuccess_9")
	public WebElement Radio_Service_Status;
	@FindBy(id="pnrPrefixWithTktNo1")
	public WebElement Text_pnr_no;
	@FindBy(xpath="(.//*[@id='searchBtn'])[position()=5]")
	public WebElement btn_service_By_PNR_NO;
	@FindBy(id="serviceStatus_2")
	public WebElement Radio_By_Trip_Code;
	@FindBy(id="serviceCode")
	public WebElement Text_TripCode;
	@FindBy(id="txtDepartureDate")
	public WebElement By_Tripcode_Datepicker;
	@FindBy(xpath="(.//*[@id='searchBtn'])[position()=6]")
	public WebElement btn_service_By_Trip_Code;
}
