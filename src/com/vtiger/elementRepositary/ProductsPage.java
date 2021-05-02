package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {

	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement createProductIMG;
	
	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[3]/td[2]")
	private WebElement firstProductID;
	
	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[3]//input")
	private WebElement firstProductCB;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteBTN;

	public WebElement getDeleteBTN() {
		return deleteBTN;
	}

	public WebElement getCreateProductIMG() {
		return createProductIMG;
	}

	public WebElement getFirstProductCB() {
		return firstProductCB;
	}

	public WebElement getFirstProductID() {
		return firstProductID;
	}
	
	
}
