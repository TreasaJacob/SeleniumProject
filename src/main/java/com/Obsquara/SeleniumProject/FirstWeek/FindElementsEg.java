package com.Obsquara.SeleniumProject.FirstWeek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsEg extends BrowserInitialization1 {
	public void findElementsEg() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multiplecheckbox = driver.findElements(By.xpath("//input[@class= 'check-box-list']"));
		for(WebElement boxes : multiplecheckbox)
		{
			boxes.click();
		}
	}

	public static void main(String[] args) {
		FindElementsEg find = new FindElementsEg();
		find.browserInitialization();
		find.findElementsEg();

	}

}
