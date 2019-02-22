package com.ksrtc.Or;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserRegPage {

	static WebElement element=null;

	public static WebElement username(WebDriver driver)
	{
		element=driver.findElement(By.id("email"));
		return element ;
	}
	public static WebElement fullname(WebDriver driver)
	{
		element=driver.findElement(By.id("fullName"));
		return element ;
	}
	public static WebElement mobileNo(WebDriver driver)
	{
		element=driver.findElement(By.id("mobileNo"));
		return element ;
	}
	public static WebElement add(WebDriver driver)
	{
		element=driver.findElement(By.name("SaveBtn"));
		return element ;
	}
	}
