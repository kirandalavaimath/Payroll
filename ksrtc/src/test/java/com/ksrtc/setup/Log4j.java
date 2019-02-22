package com.ksrtc.setup;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;


public class Log4j 
{
	private Logger logger;
	
	String loggerlocation="C:\\Users\\kiran.d\\Framework_Project\\ksrtc\\log4j.properties";
	@BeforeSuite
	public Logger getlogger()
	{
		if(logger==null)
		{
			 PropertyConfigurator.configure(loggerlocation);
             logger = Logger.getLogger(this.getClass().getCanonicalName());
             logger.info("test suite begins");
		}
		return logger;
	}
}
