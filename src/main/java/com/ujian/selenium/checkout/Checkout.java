package com.ujian.selenium.checkout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ujian.selenium.driver.DriverSingleton;

public class Checkout {

private WebDriver driver;
	
	public Checkout( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info")
	private WebElement btnSignIn;
	
	@FindBy(css = "#email")
	private WebElement txtEmail;
	
	@FindBy(css = "#passwd")
	private WebElement txtPassword;
	
	@FindBy(css = "#SubmitLogin")
	private WebElement btnSubmit;
	
	@FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div")
	private WebElement btnShooping;
	
	@FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement btnProceedItem;
	
	@FindBy(css = "#center_column > form > p > button")
	private WebElement btnProceedAddress;
	
	@FindBy(css = "#form > div > p.checkbox")
	private WebElement checkboxShipping;
	
	@FindBy(css = "#form > p > button")
	private WebElement btnProceedShipping;
	
	@FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div")
	private WebElement btnProceedPayment;
	
	@FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(1)")
	private WebElement gobtnDash;
	
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
		js.executeScript(email);
		txtEmail.sendKeys(password);
		btnSubmit.click();
	}
	
	public void checkout() {
		// TODO Auto-generated method stub
		btnShooping.click();
		btnProceedItem.click();
		btnProceedAddress.click();
		btnProceedShipping.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(btnProceedPayment));
		btnProceedPayment.click();
	}
	
	public void gotoAdd() {
		gobtnDash.click();
	}
	
}
