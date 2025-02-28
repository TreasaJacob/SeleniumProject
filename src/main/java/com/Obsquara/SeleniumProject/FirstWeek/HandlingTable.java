package com.Obsquara.SeleniumProject.FirstWeek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends BrowserInitialization1 {
	public void fullTable() 
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableelt = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tableelt.getText());
	}
	public void selectRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement singlerow  = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(singlerow.getText());
	}
	public void selectColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> singlecolumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for (WebElement columnelts : singlecolumn)
		{
			System.out.println(columnelts.getText());
		}
	}
	public void selectAData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement adata = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
		System.out.println(adata.getText());
	}
	
	public void searchData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input = "Brielle Williamson";
		List<WebElement> search = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for (WebElement el : search)
		{
			if(el.getText().equals(input))
			{
				System.out.println(el.getText());
			}
		}
	}

	public static void main(String[] args) {
		HandlingTable table = new HandlingTable();
		table.browserInitialization();
		table.fullTable();
		System.out.println("************************************");
		table.selectRow();
		System.out.println("************************************");
		table.selectColumn();
		System.out.println("************************************");
		table.selectAData();
		System.out.println("************************************");
		table.searchData();
		
	
	}

}
