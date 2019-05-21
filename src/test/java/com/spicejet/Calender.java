package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calender {
WebDriver driver;

public Calender(WebDriver driver) {
	this.driver = driver;
}
public void select() {
	driver.findElement(By.id("divpaxinfo")).click();
	try {
		Thread.sleep(2000L);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
int i=1;
	for(i=1;i<5;i++)
	{
   driver.findElement(By.id("hrefIncAdt")).click();	
    }
	driver.findElement(By.id("btnclosepaxoption")).click();
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
}

}
