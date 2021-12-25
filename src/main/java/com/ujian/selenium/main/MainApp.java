package com.ujian.selenium.main;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ujian.selenium.account.*;
import com.ujian.selenium.cart.Dress;
import com.ujian.selenium.cart.TShirt;
import com.ujian.selenium.checkout.Checkout;
import com.ujian.selenium.driver.DriverSingleton;


public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.manage().window().maximize();
		//link add chart
		driver.get("http://automationpractice.com/index.php");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//500 px vertical
		jse.executeScript("scroll(0,500);");

		//input email
/*		InputEmail login = new InputEmail();
		login.login();
		
		//input all data
		InputAllData form = new InputAllData();
		form.menuInputAllData();
*/
		
		//Add Dress
		Dress add1 = new Dress();
		add1.login("testbuka@test.com", "E12345678");
		add1.dress();
		add1.gotoAdd();
		
		//add Tshirt
		TShirt add2 = new TShirt();
		add2.login("testbuka@test.com", "E12345678");
		add2.tshirt();	
		add2.gotoAdd();

		//checkout
		Checkout check = new Checkout();
		check.login("testbuka@test.com", "E12345678");
		check.checkout();	
		check.gotoAdd();
		
	}

}
