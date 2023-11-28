package com.jenkin;

import org.testng.annotations.Test;

public class TestScript2Test {
	@Test(groups="smoke")
	public void ts3Test()
	{
		System.out.println("---TS3---");
	}
	@Test(groups="regression")
	public void ts4Test()
	{
		System.out.println("---TS4---");
	}
}
