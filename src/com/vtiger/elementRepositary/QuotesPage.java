package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotesPage {

	@FindBy(css ="img[title='Create Quote...']")
	private WebElement createQuoteIMG;

	public WebElement getCreateQuoteIMG() {
		return createQuoteIMG;
	}
	
	
}
