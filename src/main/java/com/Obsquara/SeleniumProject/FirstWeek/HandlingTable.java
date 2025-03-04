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
		System.out.println("###########################");
		WebElement singlerow1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(singlerow1.getText());
	}
	public void selectColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> singlecolumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for (WebElement columnelts : singlecolumn)
		{
			System.out.println(columnelts.getText());
		}
		System.out.println("###########################");
		List<WebElement> singlecolumn1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
		for(WebElement columnelt : singlecolumn1)
		{
			System.out.println(columnelt.getText());
		}
	}
	public void selectAData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement adata = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
		System.out.println(adata.getText());
		System.out.println("###########################");
		WebElement adata1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[6]"));
		System.out.println(adata1.getText());
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
		System.out.println("###########################");
		String input1 = "Tokyo";
		//List<WebElement> search1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));//for searching input in a column
		List<WebElement> search1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td")); //for searching input in a row.
		for(WebElement el1 : search1)
		{
			if(el1.getText().equals(input1))
			{
				System.out.println(el1.getText());
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
