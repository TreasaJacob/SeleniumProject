package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BrowserInitialization1 {
	public void idLocator()
	{
		WebElement idlocator1 = driver.findElement(By.id("single-input-field"));
		WebElement idlocator2 = driver.findElement(By.id("button-one"));
		WebElement idlocator3 = driver.findElement(By.id("value-a"));
		WebElement idlocator4 = driver.findElement(By.id("value-b"));
		WebElement idlocator5 = driver.findElement(By.id("alert-modal"));
	}
	public void classLocator()
	{
		WebElement classlocator1 = driver.findElement(By.className("navbar-brand"));
		WebElement classlocator2 = driver.findElement(By.className("top-logo"));
		WebElement classlocator3 = driver.findElement(By.className("mb-sec"));
	}
	public void nameLocator()
	{
		WebElement namelocator1 = driver.findElement(By.name("viewport"));
		WebElement namelocator2 = driver.findElement(By.name("keywords"));
		WebElement namelocator3 = driver.findElement(By.name("author"));
		WebElement namelocator4 = driver.findElement(By.name("description"));
	}

	public static void main(String[] args) {
	

	}

}
