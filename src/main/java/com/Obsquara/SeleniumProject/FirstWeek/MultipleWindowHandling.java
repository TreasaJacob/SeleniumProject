package com.Obsquara.SeleniumProject.FirstWeek;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	WebDriver driver;
	public void multipleWindow() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contact = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement loginportal = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
	    Set<String> all = driver.getWindowHandles();
		String title = "";
		for (String childwindows : all)
		{
			if(! childwindows.equals(parent))
			{

			System.out.println(childwindows);
			driver.switchTo().window(childwindows);
			System.out.println(driver.getTitle());
			title = driver.getTitle();
		}
			if(title.equals("WebDriver | Login Portal"))
			{
				
				WebElement username = driver.findElement(By.xpath("//input[@id='text']"));
				username.sendKeys("Tess");
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("pass");
				WebElement login = driver.findElement(By.id("login-button"));
				login.click();
				driver.switchTo().alert().accept();
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
				fname.sendKeys("Treasa");
				WebElement lname = driver.findElement(By.name("last_name"));
				lname.sendKeys("Jacob");
				WebElement email = driver.findElement(By.name("email"));
				email.sendKeys("treasa@gmail.com");
				WebElement message = driver.findElement(By.name("message"));
				message.sendKeys("Heloo");
				WebElement reset = driver.findElement(By.xpath("//input[@value='RESET']"));
				reset.click();
				
			}
	}
	}
	

	public static void main(String[] args) {
		MultipleWindowHandling window = new MultipleWindowHandling();
		window.multipleWindow();
	}

}
