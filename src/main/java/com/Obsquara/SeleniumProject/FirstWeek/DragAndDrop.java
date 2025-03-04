package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BrowserInitialization1 {
	public void dragAndDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragelt1 = driver.findElement(By.xpath("//span[text() = 'Draggable n°1']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dragelt1);
		actions.doubleClick(dragelt1).perform();
		
		WebElement dropspace = driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(dragelt1, dropspace).build().perform();
		
		WebElement dragelt2 = driver.findElement(By.xpath("//span[text() = 'Draggable n°2']"));
		actions.moveToElement(dragelt2);
		actions.dragAndDrop(dragelt2, dropspace).build().perform();
		
		WebElement dragelt3 = driver.findElement(By.xpath("//span[text() = 'Draggable n°3']"));
		actions.moveToElement(dragelt3);
		actions.dragAndDrop(dragelt3, dropspace).build().perform();
		
		WebElement dragelt4 = driver.findElement(By.xpath("//span[text() = 'Draggable n°4']"));
		actions.moveToElement(dragelt4);
		actions.doubleClick(dragelt4).perform();
		actions.dragAndDrop(dragelt4, dropspace).build().perform();
	}

	public static void main(String[] args) {
		DragAndDrop dragdrop = new DragAndDrop();
		dragdrop.browserInitialization();
		dragdrop.dragAndDrop();
		
	}

}
