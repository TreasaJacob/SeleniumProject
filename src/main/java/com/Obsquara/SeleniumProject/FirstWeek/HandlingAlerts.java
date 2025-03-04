package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends BrowserInitialization1{
	public void alert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click1 = driver.findElement(By.xpath("(//button[text() = 'Click me!'])[1]"));
		click1.click();
		driver.switchTo().alert().accept();
	}
	public void alert2() {
		
		WebElement click2 = driver.findElement(By.xpath("(//button[text() = 'Click me!'])[2]"));
		click2.click();
		driver.switchTo().alert().dismiss();
		}
	public void alert3()
	{
		WebElement click3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click3.click();
		driver.switchTo().alert().sendKeys("Treasa");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
	HandlingAlerts alert = new HandlingAlerts();
	alert.browserInitialization();
	alert.alert();
	alert.alert2();
	alert.alert3();

	}

}
