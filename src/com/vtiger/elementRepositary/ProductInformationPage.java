package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductInformationPage {

	@FindBy(className = "lvtHeaderText")
	private WebElement productSuccessMSZ;

	public WebElement getProductSuccessMSZ() {
		return productSuccessMSZ;
	}
	
	
}
