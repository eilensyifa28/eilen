package com.ujian.selenium.cart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ujian.selenium.driver.DriverSingleton;

public class Dress {

private WebDriver driver;
	
	public Dress( ) {
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
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(2)")
	private WebElement btnDress;
	
	@FindBy(css = "#categories_block_left > div > ul > li:nth-child(2)")
	private WebElement btnEveningDress;
	
	@FindBy(css = "#center_column > ul > li:nth-child(2) > div > div.left-block > div")
	private WebElement btnViewDress;
	
	@FindBy(css = "#add_to_cart > button")
	private WebElement btnAddCart;
	
	@FindBy(css = "#buy_block > div > div.box-cart-bottom > div:nth-child(1)")
	private WebElement gobtnAddDress;
	
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
	
	public void dress() {
		// TODO Auto-generated method stub
		btnDress.click();
		btnEveningDress.click();
		btnViewDress.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddCart));
		btnAddCart.click();
	}
	
	public void gotoAdd() {
		gobtnAddDress.click();
	}
	

	
}
