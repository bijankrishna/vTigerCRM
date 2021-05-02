package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingNewContactPage {

	@FindBy(name="lastname")
	private WebElement lastNameTB;
	@FindBy(className="save")
	private WebElement saveBTN;
	
	/*
	 * public CreatingNewContactPage(WebDriver driver) {
	 * lastNameTB=driver.findElement(By.name("lastname"));
	 * saveBTN=driver.findElement(By.className("save")); }
	 */
	
	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getSaveBTN() {
		return saveBTN;
	}
	
	
	
}
