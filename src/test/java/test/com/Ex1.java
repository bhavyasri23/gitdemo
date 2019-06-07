package test.com;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex1 {
	@BeforeTest
	public void color1() {
		System.out.println("black");
		
	}
	@Test
	public void color2() {
		System.out.println("white");
		
	}
	@Test
	public void color3() {
		System.out.println("pink");
		
	}
@BeforeSuite
public void color() {
	System.out.println("yellow");
}


}
