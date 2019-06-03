package com.opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Opencartpages {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/admin/");

	}
	@Test
	public void verify() {
		Loginpage lp = new Loginpage(driver);
         lp.login();
         Dashboardpage dp =new Dashboardpage(driver);
 		dp.Select();
 		TableRows tr =new TableRows(driver);
 		tr.categories();
 		Orderspage op= new Orderspage(driver);
 		op.orderid();
}
	
}