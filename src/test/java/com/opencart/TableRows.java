package com.opencart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TableRows {
	WebDriver driver;

	public TableRows(WebDriver driver) {
		this.driver = driver;
	}
	

	public void categories() {
		driver.findElement(By.id("menu-catalog")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul['collapse1']) li[1])")));
		driver.findElements(By.id("ul['collapse1']) li[1])"));
		 List<WebElement> elements = driver.findElements(By.cssSelector(".table tbody tr"));
		int actual =elements.size();
		int expected = 20;
		
		Assert.assertEquals(actual, expected);
		
		
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
		}
	}
	
}
