package com.ksrtc.commonfuctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
WebDriver driver;
	WebDriverWait wait;
	
	public CommonFunctions(WebDriver driver){
		this.driver=driver;
	}
	
	public boolean waitElementToBeAppear(WebElement element){
		boolean isElementDisplay=false;
		wait=new WebDriverWait(driver, 30);
		
		try {
			isElementDisplay=wait.until(ExpectedConditions.elementToBeClickable(element)) != null;
			if(isElementDisplay){
				return true;

			}else{
				return false;
			}	
		} catch (Exception e)
		{
			return false;
		}
	}
	public void clickOnElement(WebElement element){
		
		boolean isElementPresent=false;
	//	for(int i=0;i<=element.length+1;i++){
			isElementPresent=waitElementToBeAppear(element);
			if(isElementPresent){
				element.click();
			}
		}		
//	}
	public void enterValue(String input, WebElement element){
		
		boolean isElementPresent=false;
		//for(int i=0;i<=element.length+1;i++){
			isElementPresent=waitElementToBeAppear(element);
			if(isElementPresent){
				element.sendKeys(input);
			}
		}
	}
//}
