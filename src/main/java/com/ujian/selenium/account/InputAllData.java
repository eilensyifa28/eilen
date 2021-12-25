package com.ujian.selenium.account;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ujian.selenium.driver.DriverSingleton;

public class InputAllData {

private WebDriver driver;
	
	public InputAllData( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='radio-inline'][1]/label[@class='top'][1]")
	private WebElement btnRadioButton;
	
	@FindBy(css = "#customer_firstname")
	private WebElement txtFirstName;
	
	@FindBy(css = "#customer_lastname")
	private WebElement txtLastName;
	
	@FindBy(css = "#email")
	private WebElement txtEmailValidation;

	@FindBy(css = "#passwd")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//select[@id='days']")
	WebElement txtBirthDay;
	
	@FindBy(xpath = "//select[@id='months']")
	WebElement txtBirthMonth;
	
	@FindBy(xpath  = "//select[@id='years']")
	WebElement txtBirthYear;
	
	@FindBy(css = "#uniform-newsletter")
	private WebElement btnNews;
	
	@FindBy(css = "#uniform-optin")
	private WebElement btnOptin;
	
	@FindBy(css = "#firstname")
	private WebElement txtFirstName2;
	
	@FindBy(css = "#lastname")
	private WebElement txtLastName2;
	
	@FindBy(css = "#company")
	private WebElement txtCompany;
	
	@FindBy(css = "#address1")
	private WebElement txtAddress1;
	
	@FindBy(css = "#address2")
	private WebElement txtAddress2;
	
	@FindBy(css = "#city")
	private WebElement txtCity;
	
	@FindBy(css = "#uniform-id_state")
	private WebElement btnState;
	
	@FindBy(css = "#postcode")
	private WebElement txtPostCode;
	
	@FindBy(css = "#uniform-id_country")
	private WebElement btnCountry;
	
	@FindBy(css = "#other")
	private WebElement txtOther;
	
	@FindBy(css = "#phone")
	private WebElement txtHomePhone;
	
	@FindBy(css = "#phone_mobile")
	private WebElement txtMobilePhone;
	
	@FindBy(css = "#alias")
	private WebElement txtAlias;
	
	@FindBy(css = "#account-creation_form > div.submit.clearfix")
	private WebElement btnRegister;
	
	public void RadioButton() {	
		btnRadioButton.click();
	}
	
	public void menuInputAllData() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		btnRadioButton.click();
		js.executeScript("window.scrollBy(0,50)");
		txtFirstName.sendKeys("Eilen");
		txtLastName.sendKeys("Syifa");
		txtEmailValidation.sendKeys("testbuka@test.com");
		txtPassword.sendKeys("E12345678");
		js.executeScript("window.scrollBy(0,50)");
		txtBirthDay.click();
		new Select(txtBirthDay).selectByValue("28");
		txtBirthMonth.click();
		new Select(txtBirthMonth).selectByValue("2");
		txtBirthYear.click();
		new Select(txtBirthYear).selectByValue("1998");
		btnNews.click();
		btnOptin.click();
		txtFirstName2.sendKeys("Adam");
		txtLastName2.sendKeys("Alfian");
		txtCompany.sendKeys("PT. Suka Cekot Keranjang Sopi");
		txtAddress1.sendKeys("Jalan in aja dulu");
		js.executeScript("window.scrollBy(0,50)");
		txtAddress2.sendKeys("Jalan mulu jadian kapan");
		txtCity.sendKeys("Tangerang");
		btnState.click();
		new Select(btnState).selectByValue("1");
		txtPostCode.sendKeys("15138");
		btnCountry.click();
		new Select(btnCountry).selectByValue("5");
		js.executeScript("window.scrollBy(0,50)");
		txtOther.sendKeys("Cukup sekian terimakasih");
		txtHomePhone.sendKeys("021-55654770");
		txtMobilePhone.sendKeys("088888888222");
		txtAlias.clear();
		txtAlias.sendKeys("Udah ah");
		js.executeScript("window.scrollBy(0,50)");
		btnRegister.click();
	}
	
}
