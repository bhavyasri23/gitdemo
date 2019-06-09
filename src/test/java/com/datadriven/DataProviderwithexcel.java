package com.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderwithexcel {
	
	@Test(dataProvider="getdata")
	public void logintest(String username,String password) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pw")).sendKeys(password);
		driver.findElement(By.className("button r4 wide primary")).click();

	}
		
@DataProvider	
	public Object[][] getdata() throws IOException{
	
FileInputStream  fis =new FileInputStream("C://Users//suryatech//Documents//datademo.xlsx");

XSSFWorkbook  workbook = new XSSFWorkbook(fis);

XSSFSheet workSheet = workbook.getSheet("Test");

int rowcount=workSheet.getPhysicalNumberOfRows();

Object[][] data=new Object[rowcount][2];


for(int i=0;i<rowcount;i++)
{
	XSSFRow  row =workSheet.getRow(i);

	XSSFCell username = row.getCell(i =0);
    data[i][0] = username.getStringCellValue();
    
    XSSFCell password = row.getCell(i= 1);
    data[i][0] = password.getStringCellValue();

	
} 
return getdata();
}
}