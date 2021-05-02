package com.vtiger.elementRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="user_name")
	private WebElement usernameTB;
	@FindBy(name="user_password")
	private WebElement passwordTB;
	@FindBy(id="submitButton")
	private WebElement loginBTN;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public LoginPage(WebDriver driver) {
	 * usernameTB=driver.findElement(By.name("user_name"));
	 * passwordTB=driver.findElement(By.name("user_password"));
	 * loginBTN=driver.findElement(By.id("submitButton")); }
	 */

	public WebElement getUsernameTB()
	{
		return usernameTB;
	}
	public WebElement getPasswordTB()
	{
		return passwordTB;
	}
	public WebElement getLoginBTN()
	{
		return loginBTN;
	}
	
	public void loginToHomePage(String username,String password)
	{
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		loginBTN.click();
	}
}
