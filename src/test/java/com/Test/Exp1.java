package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Exp1 {
	
	@Test(groups=("smoke"))
	public void color() {
		System.out.println("black");
	}
	@BeforeSuite
	public void color1() {
		System.out.println("blue");
	}

	@Test
	public void color2() {
		System.out.println("pink");
	}

	@AfterMethod
	public void color3() {
		System.out.println("gold");
	}

	@Test
	public void color4() {
		System.out.println("white");
	}


}
