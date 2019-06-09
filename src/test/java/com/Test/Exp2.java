package com.Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Exp2 {
	@Test
	public void lang() {
		System.out.println("java");
	}
	
	@Test
	public void lang1() {
		System.out.println("corejava");
	}
	
	@AfterSuite
	public void lang2() {
		System.out.println("C");
	}
	
	@Test
	public void lang3() {
		System.out.println("C++");
	}
	
	@Test
	public void lang4() {
		System.out.println("TestNg");
	}
	

}
