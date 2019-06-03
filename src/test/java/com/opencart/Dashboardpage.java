package com.opencart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Dashboardpage {
	
		WebDriver driver;

		public Dashboardpage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void Select() { 
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#button-setting .fa.fa-cog")));

			element.click();
		driver.findElement(By.cssSelector("#button-setting .fa.fa-cog"));
driver.findElement(By.cssSelector(".close")).click();
	
		}
		
		}
			
