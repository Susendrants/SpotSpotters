package com.jenkin;

import org.testng.annotations.Test;

public class TestScript1Test {
@Test(groups="smoke")
	public void ts1Test()
	{
		System.out.println("---TS1---");
	}
	@Test(groups="regression")
	public void ts2Test()
	{
		System.out.println("---TS2---");
	}
	
}
