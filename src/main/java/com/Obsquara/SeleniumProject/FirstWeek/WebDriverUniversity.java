package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUniversity {
	WebDriver driver;
	public void browserinitialize() {
	driver = new ChromeDriver();
	driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	driver.manage().window().maximize();
		
	}
	public void dropdown()
	{
		WebElement drpdwn1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select1 = new Select(drpdwn1);
		select1.selectByVisibleText("C#");
		WebElement drpdwn2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select2 = new Select(drpdwn2);
		select2.selectByValue("maven");
		WebElement drpdwn3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select3 = new Select(drpdwn3);
		select3.selectByIndex(1);
	}
	public void checkbox() {
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='option-3']"));
		checkbox3.click();
	}
	public void radiobtn()
	{
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='green']"));
		radio1.click();
	}

	public static void main(String[] args) {
		WebDriverUniversity sample = new WebDriverUniversity();
		sample.browserinitialize();
		sample.dropdown();
		sample.checkbox();
		sample.radiobtn();

	}

}
