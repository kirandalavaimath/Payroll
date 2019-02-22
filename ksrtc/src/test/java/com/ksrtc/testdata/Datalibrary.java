package com.ksrtc.testdata;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;

import com.ksrtc.Or.SigninPage;
import com.ksrtc.helper.Helpermethods;
import com.ksrtc.setup.Setup;

public class Datalibrary
{	
	public String[] readfromexcel(String sheetname, int rowno, int cell1) throws Exception
	{
	String[] val=null; 	
	FileInputStream file=new FileInputStream("TestData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sh=wb.getSheet(sheetname);
	XSSFRow row=sh.getRow(rowno);
	XSSFCell cellun=row.getCell(cell1);
	//XSSFCell cellpwd=row.getCell(cell2);
	DataFormatter df=new DataFormatter();
	val[0]=df.formatCellValue(cellun);
	DataFormatter df1=new DataFormatter();
	//val[1]=df1.formatCellValue(cellpwd);
	Thread.sleep(2000);
    return val;
	}
	
}
