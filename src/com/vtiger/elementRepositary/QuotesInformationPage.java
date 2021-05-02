package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotesInformationPage {

	@FindBy(className = "lvtHeaderText")
	private WebElement successMSG;

	public WebElement getSuccessMSG() {
		return successMSG;
	}
	
	
}
