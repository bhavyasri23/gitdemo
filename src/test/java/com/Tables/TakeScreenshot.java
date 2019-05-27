package com.Tables;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TakeScreenshot {
	
	WebDriver driver;
	

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22610/aa-vs-ets-16th-match-group-b-t20-mumbai-2019");
	}
	@Test
	public void verify() {
		launchBrowser();
		TakesScreenshot tdriver = (TakesScreenshot) driver;
	File source =	tdriver.getScreenshotAs(OutputType.FILE);
	File targetFile = new File("D://s.jpeg");
    try {
		FileUtils.copyFile(source,targetFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
}	