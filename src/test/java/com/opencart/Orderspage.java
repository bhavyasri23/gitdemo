package com.opencart;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class  Orderspage{
		
			WebDriver driver;

			public Orderspage(WebDriver driver) {
				this.driver = driver;
			}
			
			public void  orderid() { 
				
	WebElement table=driver.findElement(By.cssSelector("td(text[]='Order ID')"));
	int count =table.findElements(By.cssSelector("td['class=text-right']div:nth =child(1)")).size();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement element = wait
	.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[class='WebDriver']")));

	int i=0;
	for(i=0;i<count;i++) {
		Assert.assertEquals(table.findElements(By.cssSelector("td['class=text-right']div:nth =child(1)")).get(i).getText(),true);
		
	}
				
	}
	}


