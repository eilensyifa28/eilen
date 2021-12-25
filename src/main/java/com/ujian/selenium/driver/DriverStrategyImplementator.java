package com.ujian.selenium.driver;

import com.ujian.selenium.driver.Chrome;
import com.ujian.selenium.driver.DriverStrategy;
import com.ujian.selenium.driver.Firefox;

public class DriverStrategyImplementator {

public static DriverStrategy chooseStrategy(String strategy) {
		
		switch (strategy) {
		case "chrome":
			return new Chrome();
		
		case "firefox":
			return new Firefox();
			
		default:
			return null;
		}
	}
}
