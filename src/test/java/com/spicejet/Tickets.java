package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tickets {
	WebDriver driver;

	public Tickets(WebDriver driver) {
		this.driver = driver;
	}
public void booking() {
	driver.findElement(By.className("red-arrow-btn")).click();
	driver.findElement(By.xpath("//a[@value='CJB']")).click();
	driver.findElement(By.xpath("//a[@value='HYD']")).click();

}

}

