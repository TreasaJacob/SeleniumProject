package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxDemo extends BrowserInitialization1{
	public void checkboxDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement checkboxlink = driver.findElement(By.xpath("//a[text() ='Checkbox Demo']"));
		checkboxlink.click();
		 WebElement checkbox = driver.findElement(By.xpath("//input[@id = 'gridCheck']"));
		 checkbox.click();
		 System.out.println(checkbox.isSelected());
	}
	
	
 
  public void clickRadioButton() {
	 driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	 WebElement  radio = driver.findElement(By.xpath("//input[@id= 'inlineRadio1']"));
	 radio.click();
	   }
	
	public static void main(String[] args) {
		CheckboxDemo check = new CheckboxDemo();
		check.browserInitialization();
		check.checkboxDemo();
		check.clickRadioButton();
		

	}

}
