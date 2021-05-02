package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage {
	
	@FindBy(css="img[title='Create Contact...']")
	private WebElement createContactIMG;
	
	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[3]/td[2]")
	private WebElement firstContactID;
	
	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[3]/td[4]/a")
	private WebElement firstContactLastName;
	
	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[3]//input")
	private WebElement firstContactCB;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteBTN;

	/*public ContactsPage(WebDriver driver)
	{
		createContactIMG=driver.findElement(By.cssSelector("img[title='Create Contact...']"));
	}*/
	
	
	public WebElement getCreateContactIMG()
	{
		return createContactIMG;
	}

	public WebElement getFirstContactID() {
		return firstContactID;
	}

	public WebElement getFirstContactLastName() {
		return firstContactLastName;
	}

	public WebElement getDeleteBTN() {
		return deleteBTN;
	}

	public WebElement getFirstContactCB() {
		return firstContactCB;
	}
	

}
