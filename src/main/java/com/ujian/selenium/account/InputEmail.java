package com.ujian.selenium.account;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ujian.selenium.driver.DriverSingleton;

public class InputEmail {

private WebDriver driver;
	
	public InputEmail( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info")
	private WebElement btnSignIn;
	
	@FindBy(css = "#email_create")
	private WebElement txtEmail;
	
	@FindBy(css = "#SubmitCreate")
	private WebElement btnSubmit;

	public void login() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
		js.executeScript("window.scrollBy(0,50)");
		txtEmail.sendKeys("testbuka@test.com");
		js.executeScript("window.scrollBy(0,500)");
		btnSubmit.click();
	}
	
}
