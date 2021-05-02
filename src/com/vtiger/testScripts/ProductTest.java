package com.vtiger.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.elementRepositary.CreatingNewProductPage;
import com.vtiger.elementRepositary.HomePage;
import com.vtiger.elementRepositary.ProductInformationPage;
import com.vtiger.elementRepositary.ProductsPage;
import com.vtiger.genericCodes.BaseClass;
import com.vtiger.genericCodes.DataUtils;
@Listeners(com.vtiger.genericCodes.Monitor.class)
public class ProductTest extends BaseClass {

	@Test
	public void createNewProduct() throws Exception
	{
		DataUtils du=new DataUtils();
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ProductsPage pp=PageFactory.initElements(driver, ProductsPage.class);
		CreatingNewProductPage cnpp = PageFactory.initElements(driver, CreatingNewProductPage.class);
		ProductInformationPage pip=PageFactory.initElements(driver, ProductInformationPage.class);
		
		hp.getProductsLink().click();
		pp.getCreateProductIMG().click();
		cnpp.getProductNameTB().sendKeys(du.getDataFromExcel("ProductData", 1, 3));
		cnpp.getSaveBTN().click();
		String successMSZ = pip.getProductSuccessMSZ().getText();
		Assert.assertTrue(successMSZ.contains(du.getDataFromExcel("ProductData",6,3)),"Product creation Failed");
		Reporter.log("Product created Successfully",true);
		
	}
	
	   @Test
	    public void deleteFirstProduct() throws Exception
	    {
			HomePage hp=PageFactory.initElements(driver, HomePage.class);  //new HomePage(driver);
			ProductsPage pp=PageFactory.initElements(driver, ProductsPage.class);

			
			hp.getProductsLink().click();
			String beforeProductID = pp.getFirstProductID().getText();
			pp.getFirstProductCB().click();
			pp.getDeleteBTN().click();
			
			cu.acceptAlert(driver);
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[2]"), beforeProductID));
			
			String afterProductID = pp.getFirstProductID().getText();
			Assert.assertTrue(!afterProductID.equals(beforeProductID),"First Product Deletion Failed");
			Reporter.log("First Product Deleted Successfully",true);


	    }

}
