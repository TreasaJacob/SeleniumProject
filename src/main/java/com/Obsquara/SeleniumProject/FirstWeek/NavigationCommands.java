package com.Obsquara.SeleniumProject.FirstWeek;

public class NavigationCommands extends CreateMethods {
	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands commands = new NavigationCommands();
		commands.browserInitialization();
		commands.navigationCommands();

	}

}
