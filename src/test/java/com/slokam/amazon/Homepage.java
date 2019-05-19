package com.slokam.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void search() {

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptops");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		driver.findElement(By.xpath("//img[@class='s-image']")).click();

	}

}
