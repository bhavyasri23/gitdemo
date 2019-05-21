package com.spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Spicejetpages {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com");

	}
	@Test
	public void verify() {
		Calender cl = new Calender(driver);
		cl.select();
	}
	@Test
	public void Test1() {
		Tickets tc = new Tickets(driver);
		tc.booking();
	}
	
}
	
		
	

