package com.Test;

import org.testng.annotations.Test;

public class Exp3 {
	@Test
	public void Demo() {
		System.out.println("hiee");
	}
	
	@Test(groups=("smoke"))
	public void Demo1() {
		System.out.println("hello");
	}
	
	@Test
	public void Demo2() {
		System.out.println("bye");
	}
	
	@Test
	public void Demo3() {
		System.out.println("oops");
	}

}
