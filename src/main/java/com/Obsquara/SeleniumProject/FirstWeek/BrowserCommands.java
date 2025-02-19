package com.Obsquara.SeleniumProject.FirstWeek;

public class BrowserCommands extends BrowserInitialization1 {
	public void browserCommands()
	{
	String title = driver.getTitle();
	System.out.println("Title is " + title);
	String url = driver.getCurrentUrl();
	System.out.println("Url is " + url);
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	}

	public static void main(String[] args) {
		BrowserCommands command = new BrowserCommands();
		command.browserInitialization();
		command.browserCommands();

	}

}

