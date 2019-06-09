package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
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
	/*@DataProvider
	
	public Object[][]  getdata()
	{
		Object[][] data = new Object[4][2];
		
		data[0][0]="sai";
		data[0][1]="sai123";
		
		data[1][0]="arun";
		data[1][1]="arun123";
		
		data[2][0]="amul";
		data[2][1]="amul123";
		
		data[1][0]="aryan";
		data[1][1]="aryan123";
		
		return getdata();
	}
*/
}
