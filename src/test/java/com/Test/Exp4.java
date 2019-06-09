package com.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exp4 {
	
	@Test
	public void laptops() {
		System.out.println("Dell");
	}
	
	@BeforeMethod
	public void laptops1() {
		System.out.println("Hp");
	}
	
	@Test(groups=("smoke"))
	public void laptops2() {
		System.out.println("Apple");
	}

}
