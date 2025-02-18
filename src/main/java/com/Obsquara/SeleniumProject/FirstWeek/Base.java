package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");   //get method is the abstract method inside the Webdriver interface
		driver.manage().window().maximize();
		//driver.close();
		driver.quit();
	}

}
