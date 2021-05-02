package com.vtiger.elementRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationsWindowPopUpPage {
	@FindBy(xpath="(//table[@class='small'])[3]//tr[2]/td[1]/a")
	private WebElement firstOrganizationSelect;

	public WebElement getFirstOrganizationSelect() {
		return firstOrganizationSelect;
	}
	
	
}
