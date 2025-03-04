package com.Obsquara.SeleniumProject.FirstWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BrowserInitialization1 {
	public void idLocator() {
		WebElement idlocator1 = driver.findElement(By.id("single-input-field"));
		WebElement idlocator2 = driver.findElement(By.id("button-one"));
		WebElement idlocator3 = driver.findElement(By.id("value-a"));
		WebElement idlocator4 = driver.findElement(By.id("value-b"));
		WebElement idlocator5 = driver.findElement(By.id("alert-modal"));
	}

	public void classLocator() {
		WebElement classlocator1 = driver.findElement(By.className("navbar-brand"));
		WebElement classlocator2 = driver.findElement(By.className("top-logo"));
		WebElement classlocator3 = driver.findElement(By.className("mb-sec"));
	}

	public void nameLocator() {
		WebElement namelocator1 = driver.findElement(By.name("viewport"));
		WebElement namelocator2 = driver.findElement(By.name("keywords"));
		WebElement namelocator3 = driver.findElement(By.name("author"));
		WebElement namelocator4 = driver.findElement(By.name("description"));
	}

	public void linkTextLocator() {
		WebElement linklocator = driver.findElement(By.linkText("check-box-demo.php"));
		WebElement linklocator1 = driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement linklocator2 = driver.findElement(By.linkText("select-input.php"));
		WebElement linklocator3 = driver.findElement(By.linkText("jquery-select.php"));
	}

	public void partialLinkTextLocator() {
		WebElement partiallinklocator = driver.findElement(By.partialLinkText("check-box"));
		WebElement partiallinktext1 = driver.findElement(By.partialLinkText("radio-button"));
		WebElement partiallinktext2 = driver.findElement(By.partialLinkText("ajax-form"));
	}

	public void cssSelector() {
		/*
		 * tag and id tag and class tag and attribute tag,class and attribute
		 */
		// 1.tag#id

		WebElement cssselectmessagefield = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement cssselect1 = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssselect2 = driver.findElement(By.cssSelector("input#value-a"));
		WebElement cssselect3 = driver.findElement(By.cssSelector("input#value-b"));

		// 2.tag.class
		WebElement cssselectmessagefield2 = driver.findElement(By.cssSelector("ul.navbar-nav"));
		WebElement cssselect4 = driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
		WebElement cssselect5 = driver.findElement(By.cssSelector("div.top-logo"));

		// 3.tag[attributetype=attributevalue]
		WebElement cssselector3 = driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement cssselector4 = driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement cssselector5 = driver.findElement(By.cssSelector("input[id=value-a]"));

		// 4.tag.class[attributetype = attributevalue]
		WebElement cssselector6 = driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		WebElement cssselector7 = driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
		WebElement cssselector8 = driver.findElement(By.cssSelector("input.form-control[id=value-b]"));
	}

	public void absoluteXpath() 
	{
		//Right click on code->Copy->Copy full xpath
		WebElement absolutepath1 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		WebElement absoluepathofshowmessagbutton = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
		WebElement absolutepathgeta = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input"));
	}
	public void relativeXpath()
		{
		//Syntax : //tagname[@attributetype= 'attributevalue']
			WebElement relativepathentermsg1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
			WebElement relativexpathshowmessage2 = driver.findElement(By.xpath("//button[@id='button-one']"));
			WebElement relativexpathvaluea = driver.findElement(By.xpath("//input[@id='value-a']"));
			WebElement relativexpathvalueb = driver.findElement(By.xpath("//input[@id='value-b']"));
			WebElement relativexpathgetvalue = driver.findElement(By.xpath("//button[@id='button-two']"));		
		}
	public void dynamicXpath()
	{
		//Syntax : //tagname[contains(@attributetype,'attributevalue')]
		WebElement dynamicpath1 = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement dynamicxpath2 = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement dynamicxpath3 = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		WebElement dynamicxpath4 = driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		
		
		
		
		//Syntax : //tagname[text()= 'text messsage')]
		WebElement textxpath1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement textxpath2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement textxpath3 = driver.findElement(By.xpath("//div[text()='Your Message : ']"));
		
		//Syntax :(//tagname[@atrributetype = 'attributevalue'])[index]
		
		WebElement indexmessage1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		WebElement indexvalue2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
	}
	

	public static void main(String[] args) {

	}

}
