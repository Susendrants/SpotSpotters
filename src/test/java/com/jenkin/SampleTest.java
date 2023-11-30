package com.jenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driver;
@Test
public void m1Test()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	System.out.println("---Job Done---");
}
}
