package com.vtiger.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.vtiger.elementRepositary.ContactsWindowPopUpPage;
import com.vtiger.elementRepositary.CreatingNewQuotePage;
import com.vtiger.elementRepositary.HomePage;
import com.vtiger.elementRepositary.OrganizationsWindowPopUpPage;
import com.vtiger.elementRepositary.ProductsWindowPopUpPage;
import com.vtiger.elementRepositary.QuotesInformationPage;
import com.vtiger.elementRepositary.QuotesPage;
import com.vtiger.genericCodes.BaseClass;
import com.vtiger.genericCodes.DataUtils;
@Listeners(com.vtiger.genericCodes.Monitor.class)
public class QuoteTest  extends BaseClass{
	static String mainID;
	@Test
	public void createNewQuote() throws Exception {

		DataUtils du = new DataUtils();

		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		QuotesPage qp = PageFactory.initElements(driver, QuotesPage.class);
		CreatingNewQuotePage cnqp = PageFactory.initElements(driver, CreatingNewQuotePage.class);
		ContactsWindowPopUpPage cwpp=PageFactory.initElements(driver, ContactsWindowPopUpPage.class);
		OrganizationsWindowPopUpPage owpp=PageFactory.initElements(driver, OrganizationsWindowPopUpPage.class);
		ProductsWindowPopUpPage pwpp=PageFactory.initElements(driver, ProductsWindowPopUpPage.class);
		QuotesInformationPage qip=PageFactory.initElements(driver, QuotesInformationPage.class);

		//mouse over more
		cu.mouseMoveToElement(driver, hp.getMoreLink());
		
		//click on Quotes:-home page
		hp.getQuotesLink().click();

		//click on create quote image:-Quotes page
		qp.getCreateQuoteIMG().click();

		//put subject TB value:-CreatingNewQuotePage
		cnqp.getSubjectTB().sendKeys(du.getDataFromExcel("SubjectData", 4, 3));
		
		//QuoteStage DropDown,Reviewed Selected:-CreatingNewQuotePage
		Select s=new Select(cnqp.getQuoteStageDD());
		s.selectByValue(du.getDataFromExcel("SubjectData",43,3));
		
		//click on contact name add image:-CreatingNewQuotePage
		cnqp.getContactNameAddIMG().click();
		
		//contacts popup
		cu.switchToChildWindow(driver);
		cwpp.getFirstContactSelect().click();
		
		//contacts alert popup
		cu.dismissAlert(driver);
		
		cu.switchToMainWindow(driver);
		
		//click on Organization Name Add IMG:-CreatingNewQuotePage
		cnqp.getOrganizationNameAddIMG().click();
		
		//organization popup
		cu.switchToChildWindow(driver);
		owpp.getFirstOrganizationSelect().click();
		
		//organization alert popup
		cu.dismissAlert(driver);
		
		cu.switchToMainWindow(driver);
		
		//put value on billing address TB
		cnqp.getBillingAddressTB().sendKeys(du.getDataFromExcel("SubjectData",14,3));
		//put value on shipping address TB
		cnqp.getShippingAddressTB().sendKeys(du.getDataFromExcel("SubjectData",24,3));
		
		//click on itemname search icon
		cnqp.getItemNameSearchIcon().click();
		
		//Products window popup
		cu.switchToChildWindow(driver);
		
		//click on 1st product
		pwpp.getFirstProductSelect().click();
		
		cu.switchToMainWindow(driver);
		
		//put quantity for product
		cnqp.getQuantityTB().sendKeys(du.getDataFromExcel("SubjectData",46,3));
		
		//click on save button
		cnqp.getSaveBTN().click();
		
		//fetch confirmation message
		String successMsg = qip.getSuccessMSG().getText();
		Assert.assertTrue(successMsg.contains(du.getDataFromExcel("SubjectData",47,3)),"Quotes creation failed");
		Reporter.log("Quotes Created Successfully",true);
	}
	
	/*void mousePerform(WebDriver driver, WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	void WindowPopUpHandle()
	{
		mainID = driver.getWindowHandle();
		Set<String> allID = driver.getWindowHandles();
		for(String id:allID)
		{
			if(!mainID.equals(id))
				driver.switchTo().window(id);
		}
	}
	
	void AlertPopUpHandle()
	{
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		System.out.println(msg);
		alt.dismiss();
	}*/

}
