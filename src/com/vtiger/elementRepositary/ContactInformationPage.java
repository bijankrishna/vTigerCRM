package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationPage {
	
	@FindBy(className="dvHeaderText")
	private WebElement confirmationMessage;
	
	/*
	 * public ContactInformationPage(WebDriver driver) {
	 * confirmationMessage=driver.findElement(By.className("dvHeaderText")); }
	 */

	public WebElement getConfirmationMessage() {
		return confirmationMessage;
	}
	
	
}
