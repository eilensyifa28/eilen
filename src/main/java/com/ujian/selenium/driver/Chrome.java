package com.ujian.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements DriverStrategy {

	public WebDriver setStrategy() {
		
//		System.setProperty("webdriver.chrome.driver", "/home/luffy/chromedriver");
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("useAutomationExtension", false);
//		options.addArguments("--no-sanbox");
//		
//		return new ChromeDriver(options);
		
		System.setProperty("webdriver.chrome.driver", "G:ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
