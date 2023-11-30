package com.jenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	public WebDriver driver;
	@Test
	public void Test6()
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		if (BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
	}

}
