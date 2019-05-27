package com.Tables;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rows {
	
		WebDriver driver;
		

		public Rows(WebDriver driver) {
			this.driver = driver;
		}
		
		public void test1() {
		WebElement  table= driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); 
		int rowcount = table.findElements(By.cssSelector("ccb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']div:nth=child(3)")).size();
		for(int i=0;i<count;i++)
		{
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']div:nth=child(3)")).get(i).getText());
		}

		
}			

}
