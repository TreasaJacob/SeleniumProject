package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialization1 {
	public WebDriver driver;
	public void browserInitialization()
	{
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");   //get method is the abstract method inside the Webdriver interface
		driver.manage().window().maximize();	
	}
	public void quitAndClose()
	{
		driver.quit();
		
	}

	public static void main(String[] args) {
	BrowserInitialization1 browserinitialize = new BrowserInitialization1();
	browserinitialize.browserInitialization();
	browserinitialize.quitAndClose();

	}

}
