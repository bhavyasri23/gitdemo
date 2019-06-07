package test.com;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Ex3 {
	@Test
	public void code1() {
		System.out.println("selenium");
	}
	@Test(groups=("smoke"))
	public void code2() {
		System.out.println("API");
	}
	@Test
	public void code3() {
		System.out.println("QTP");
	}
@AfterSuite
public void code4() {
	System.out.println("Testng");
}
}
