package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingNewQuotePage {
	@FindBy(name="subject")
	private WebElement subjectTB;
	
	@FindBy(name="quotestage")
	private WebElement quoteStageDD;
	
	@FindBy(xpath ="//input[@name='contact_id']/following-sibling::img")
	private WebElement contactNameAddIMG;
	
	@FindBy(xpath ="//input[@id='single_accountid']/following-sibling::img")
	private WebElement organizationNameAddIMG;
	
	@FindBy(name="bill_street")
	private WebElement billingAddressTB;
	
	@FindBy(name="ship_street")
	private WebElement shippingAddressTB;
	
	@FindBy(id="searchIcon1")
	private WebElement itemNameSearchIcon;
	
	@FindBy(id ="qty1")
	private WebElement quantityTB;
	
	@FindBy(className ="save")
	private WebElement saveBTN;

	
	public WebElement getQuantityTB() {
		return quantityTB;
	}

	public WebElement getSaveBTN() {
		return saveBTN;
	}

	public WebElement getItemNameSearchIcon() {
		return itemNameSearchIcon;
	}

	public WebElement getSubjectTB() {
		return subjectTB;
	}

	public WebElement getQuoteStageDD() {
		return quoteStageDD;
	}

	public WebElement getContactNameAddIMG() {
		return contactNameAddIMG;
	}

	public WebElement getOrganizationNameAddIMG() {
		return organizationNameAddIMG;
	}

	public WebElement getBillingAddressTB() {
		return billingAddressTB;
	}

	public WebElement getShippingAddressTB() {
		return shippingAddressTB;
	}
	
	
	
	
}
