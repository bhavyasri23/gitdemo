package test.com;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex2 {
	@Test
	public void lan1() {
		System.out.println("java");
	}
	@AfterTest
	public void lan2() {
		System.out.println("C");
		
	}
	@Test(groups=("smoke"))
	public void lan3() {
		System.out.println("C++");
		
	}
	@BeforeMethod
	public void lan4() {
		System.out.println("Corejava");
	}

}
