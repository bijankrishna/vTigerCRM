package com.vtiger.genericCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.vtiger.elementRepositary.HomePage;
import com.vtiger.elementRepositary.LoginPage;

public class BaseClass {

	public DataUtils du=new DataUtils();
	public WebDriver driver;
	public static WebDriver driverForScreenShot;
	public CommonUtils cu=new CommonUtils();
	
	@BeforeClass(alwaysRun = true)
	public void configBC() throws Exception
	{
		//lunch browser
		if(du.getDataFromProperty("BROWSER").equals("chrome"))
			driver=new ChromeDriver();
		else if(du.getDataFromProperty("BROWSER").equals("firefox"))
			driver=new FirefoxDriver();
		System.out.println("Browser Lunched");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//open application
		driver.get(du.getDataFromProperty("URL"));
		System.out.println("Application Opened");
		driverForScreenShot=driver;
	}
	/*@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void configBC(String browser) throws Exception
	{
		//lunch browser
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		else if(browser.equals("firefox"))
			driver=new FirefoxDriver();
		System.out.println("Browser Lunched");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//open application
		driver.get(du.getDataFromProperty("URL"));
		System.out.println("Application Opened");
		driverForScreenShot=driver;
	}*/
	
	@BeforeMethod(alwaysRun = true)
	public void configBM() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginToHomePage(du.getDataFromProperty("USERNAME"), du.getDataFromProperty("PASSWORD"));
		System.out.println("LoggedIn to App");
	}
	
	/*@Parameters({"username","password"})
	@BeforeMethod(alwaysRun = true)
	public void configBM(String username,String password) throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginToHomePage(username,password);
		System.out.println("LoggedIn to App");
	}*/
	
	@AfterMethod(alwaysRun = true)
	public void configAM()
	{
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		
		Actions act=new Actions(driver);
		act.moveToElement(hp.getAdministratorIMG()).perform();
		act.moveToElement(hp.getSignOutLink()).click().build().perform();
		System.out.println("LoggedOut Successfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void configAC()
	{
		driver.quit();
		System.out.println("Browser Closed");
	}
}
