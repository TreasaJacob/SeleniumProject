package com.Obsquara.SeleniumProject.FirstWeek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsEgText extends BrowserInitialization1{
	public void findElementsEgText() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> multipletextinput = driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement element : multipletextinput)
		{
			element.sendKeys("Hello");
		}
		
	}

	public static void main(String[] args) {
		FindElementsEgText entertext = new FindElementsEgText();
		entertext.browserInitialization();
		entertext.findElementsEgText();
		

	}

}
