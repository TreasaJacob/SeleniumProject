package com.Obsquara.SeleniumProject.TestNgSample;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorEg {
	WebDriver driver;
  @Test
  public void scrollJavaScriptExecutor() {
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  JavascriptExecutor executor = (JavascriptExecutor) driver;
	  executor.executeScript("window.scrollBy(0,3000)");
	  executor.executeScript("window.scrollBy(0,-2000)");
  }
}
