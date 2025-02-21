package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends BrowserInitialization1 
{
	public void inputMessage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefield = driver.findElement(By.id("single-input-field"));
		messagefield.sendKeys("Hello");
		WebElement sendmessagebutton = driver.findElement(By.id("button-one"));
		sendmessagebutton.click();
		
	}
	public void getTotal() {
		WebElement inputvaluea = driver.findElement(By.id("value-a"));
		inputvaluea.sendKeys("100");
		WebElement inputvalueb = driver.findElement(By.id("value-b"));
		inputvalueb.sendKeys("50");
		WebElement getvaluebutton = driver.findElement(By.id("button-two"));
		getvaluebutton.click();
		
	}

	public static void main(String[] args) {
		InputForm ipform = new InputForm();
		ipform.browserInitialization();
		ipform.inputMessage();
		ipform.getTotal();

	}

}
