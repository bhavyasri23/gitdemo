package com.slokam.moodle.testscripts;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.moodle.utils.io.excel.ReadExcel;
import com.slokam.moodle.utils.io.excel.WriteExcel;

public class TestMoodleLogin {
	public WebDriver driver = null;

	@Test
	public void testLogin() {
		ReadExcel er = new ReadExcel();
		String userName = er.getData(2, 1);
		String password = er.getData(2, 2);
		String validationMessage = er.getData(2, 3);
		String url = "http://localhost:90/moodle";

		driver = new FirefoxDriver();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();

		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginbtn")).click();

		if (isElementPresent(By.id("loginerrormessage"))) {
			String actualMessage = getErrorMessage();
			
			WriteExcel excel  = new WriteExcel();
			excel.insertValue(1, 4, CellType.STRING	, "Result");
			if(actualMessage.equals(validationMessage)){
				excel.insertValue(2, 4, CellType.STRING	, "PASS");
			}else{
				excel.insertValue(2, 4, CellType.STRING	, "FAIL");
			}
			excel.writeFinal();
			Assert.assertEquals(actualMessage, validationMessage);
		} else {
			validateProfileMessage();
		}

	}

	private void validateProfileMessage() {
		// TODO Auto-generated method stub

	}

	private String getErrorMessage() {

		String actualMessage = driver.findElement(By.xpath("//div[@class='loginerrors']/span")).getText();
		return actualMessage;
	}

	public boolean isElementPresent(By by) {
		boolean flag = false;
		if (driver.findElements(by).size() > 0) {
			flag = true;
		}
		return flag;
	}
}
