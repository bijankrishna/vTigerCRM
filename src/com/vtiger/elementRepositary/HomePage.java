package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText = "Products")
	private WebElement productsLink;

	@FindBy(linkText="Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText="More")
	private WebElement moreLink;
	
	@FindBy(name="Quotes")
	private WebElement quotesLink;
	
	@FindBy(xpath = "//span[@class='userName']/../following-sibling::td[1]/img")
	private WebElement administratorIMG;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	
	
	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getAdministratorIMG() {
		return administratorIMG;
	}

	public WebElement getQuotesLink() {
		return quotesLink;
	}

	public WebElement getContactsLink()
	{
		return contactsLink;
	}
}
