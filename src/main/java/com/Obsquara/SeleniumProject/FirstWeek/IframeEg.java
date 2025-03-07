package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg {
	WebDriver driver;
	public void getSite() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	    driver.switchTo().frame(iframe);
		WebElement jmeterelt  = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeterelt.click();
		
	}
	 

	public static void main(String[] args) {
		IframeEg frameeg = new IframeEg();
		frameeg.getSite();
	}

}
