package com.ujian.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver", "G:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
