package com.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
	public void login() {
		
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		
	}
	
}
