package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingNewProductPage {

	@FindBy(name = "productname")
	private WebElement productNameTB;
	
	@FindBy(className="save")
	private WebElement saveBTN;

	public WebElement getProductNameTB() {
		return productNameTB;
	}
	
	public WebElement getSaveBTN() {
		return saveBTN;
}
}
