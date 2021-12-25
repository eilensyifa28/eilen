package com.ujian.selenium.cart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ujian.selenium.driver.DriverSingleton;

public class TShirt {

private WebDriver driver;
	
	public TShirt( ) {
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
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(3)")
	private WebElement btnTshirt;
	
	@FindBy(css = "#center_column > ul > li > div > div.left-block > div")
	private WebElement btnViewTshirt;
	
	@FindBy(css = "#add_to_cart > button")
	private WebElement btnAddCart;
	
	@FindBy(css = "#buy_block > div > div.box-cart-bottom > div:nth-child(1)")
	private WebElement gobtnTshirt;
	
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
	
	public void tshirt() {
		// TODO Auto-generated method stub
		btnTshirt.click();
		btnViewTshirt.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(btnAddCart));
		btnAddCart.click();
	}
	
	public void gotoAdd() {
		gobtnTshirt.click();
	}
}
