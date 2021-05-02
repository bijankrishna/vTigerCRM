package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsWindowPopUpPage {
	@FindBy(xpath="(//table[@class='small'])[3]//tr[2]/td[1]/a")
	private WebElement firstContactSelect;

	public WebElement getFirstContactSelect() {
		return firstContactSelect;
	}
	
	
}
