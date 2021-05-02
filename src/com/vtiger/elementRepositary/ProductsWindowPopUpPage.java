package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsWindowPopUpPage {

	@FindBy(xpath = "(//table[@class='small'])[3]//tr[2]/td[2]/a")
	private WebElement firstProductSelect;

	public WebElement getFirstProductSelect() {
		return firstProductSelect;
	}
	
	
}
