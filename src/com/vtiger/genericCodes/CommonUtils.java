package com.vtiger.genericCodes;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class CommonUtils {

	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void validateAndAcceptAlert(WebDriver driver,String expText)
	{
		Alert alt=driver.switchTo().alert();
		String actText = alt.getText();
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actText.contains(expText),"Alert message validation failed");
		alt.accept();
	}
	
	public void validateAndDismissAlert(WebDriver driver,String expText)
	{
		Alert alt=driver.switchTo().alert();
		String actText = alt.getText();
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actText.contains(expText),"Alert message validation failed");
		alt.dismiss();
	}
	
	public void mouseMoveToElement(WebDriver driver,WebElement target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	String mainID;
	public void switchToChildWindow(WebDriver driver)
	{
		mainID = driver.getWindowHandle();
		Set<String> allID = driver.getWindowHandles();
		for(String id:allID)
		{
			if(!mainID.equals(id))
			{
				driver.switchTo().window(id);
			}
		}
	}
	
	public void switchToMainWindow(WebDriver driver)
	{
		driver.switchTo().window(mainID);
	}
	
	public void switchToWindowByTitle(WebDriver driver,String expTitle)
	{
		mainID = driver.getWindowHandle();
		Set<String> allID = driver.getWindowHandles();
		for(String id:allID)
		{
			driver.switchTo().window(id);
			String actTitle = driver.getTitle();		
			if(actTitle.contains(expTitle))
			{
				break;
			}
		}
	}
}
