package test.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Testxml {
	@Test
	public void Demo() {
		System.out.println("hello");
		
	}
	@Test(groups=("smoke"))
	public void Demo2() {
		System.out.println("hiee");
	}
	@Test
	public void Demo3() {
		System.out.println("bye");
	}
	@AfterMethod
	public void Demo4() {
		System.out.println("How r u");
	}

}
