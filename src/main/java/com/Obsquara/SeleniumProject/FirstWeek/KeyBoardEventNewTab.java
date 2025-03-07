package com.Obsquara.SeleniumProject.FirstWeek;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEventNewTab {
	WebDriver driver;
	public void getSiteAndOpenNewTab() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) throws AWTException {
		KeyBoardEventNewTab key = new KeyBoardEventNewTab();
		key.getSiteAndOpenNewTab();

	}

}
