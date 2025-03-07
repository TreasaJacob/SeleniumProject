package com.Obsquara.SeleniumProject.FirstWeek;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadEg {
	WebDriver driver;
	public void uploadFile() {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement clickfileupload = driver.findElement(By.xpath("//span[text() = 'Select PDF file']"));
		clickfileupload.click();
		clickfileupload.sendKeys("C:\\Assignments\\table program.pdf");
	}
	public void fileUploadRobotClass() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement clickfileupload = driver.findElement(By.xpath("//span[text() = 'Select PDF file']"));
		clickfileupload.click();
		StringSelection selection = new StringSelection("C:\\Assignments\\table program.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Robot robo = new Robot();
		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) throws AWTException {
	FileUploadEg upload = new FileUploadEg();
	//upload.uploadFile();
	upload.fileUploadRobotClass();
	}

}
