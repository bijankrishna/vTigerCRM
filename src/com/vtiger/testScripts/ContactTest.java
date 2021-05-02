package com.vtiger.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.vtiger.elementRepositary.ContactInformationPage;
import com.vtiger.elementRepositary.ContactsPage;
import com.vtiger.elementRepositary.CreatingNewContactPage;
import com.vtiger.elementRepositary.HomePage;
import com.vtiger.genericCodes.BaseClass;
import com.vtiger.genericCodes.DataUtils;
@Listeners(com.vtiger.genericCodes.Monitor.class)
public class ContactTest extends BaseClass {
   @Test
	public void createNewContact() throws Exception {
		
		DataUtils du=new DataUtils();
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);  //new HomePage(driver);
		ContactsPage cp=PageFactory.initElements(driver, ContactsPage.class);  //new ContactsPage(driver);
		CreatingNewContactPage cncp=PageFactory.initElements(driver, CreatingNewContactPage.class);  //new CreatingNewContactPage(driver);
		ContactInformationPage cip=PageFactory.initElements(driver, ContactInformationPage.class);  //new ContactInformationPage(driver);

		hp.getContactsLink().click();
//		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateContactIMG().click();
//		CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
		cncp.getLastNameTB().sendKeys(du.getDataFromExcel("ContactData",6,3));
		cncp.getSaveBTN().click();
//		ContactInformationPage cip=new ContactInformationPage(driver);
		String conMsz = cip.getConfirmationMessage().getText();
		Assert.assertTrue(conMsz.contains(du.getDataFromExcel("ContactData",1,3)),"Contact creation Failed");
		Reporter.log("Contact created Successfully",true);
		
	}
    
  @Test
    public void deleteFirstContact() throws Exception
    {
		HomePage hp=PageFactory.initElements(driver, HomePage.class);  //new HomePage(driver);
		ContactsPage cp=PageFactory.initElements(driver, ContactsPage.class);  //new ContactsPage(driver);

		
		hp.getContactsLink().click();
		String beforeContactID = cp.getFirstContactID().getText();
		cp.getFirstContactCB().click();
		cp.getDeleteBTN().click();
		
		cu.acceptAlert(driver);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[2]"), beforeContactID));
		
		String afterContactID = cp.getFirstContactID().getText();
		Assert.assertTrue(!afterContactID.equals(beforeContactID),"First Contact Deletion Failed");
		Reporter.log("First Contact Deleted Successfully",true);


    }

}
