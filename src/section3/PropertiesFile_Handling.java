package section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFile_Handling {
	static WebDriver dr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="E:\\selenium programs\\DataFiles\\commonDataLoginPage.properties";
		FileInputStream fis=new FileInputStream(path);
		
		Properties pobj=new Properties();
		pobj.load(fis);
		String browser=pobj.getProperty("BROWSER");
		String url=pobj.getProperty("URL");
		String username = pobj.getProperty("USERNAME");
		String password = pobj.getProperty("PASSWORD");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		if(browser.equals("chrome"))
			dr=new ChromeDriver();
		else
			dr=new FirefoxDriver();
		
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.get(url);
		dr.findElement(By.name("user_name")).sendKeys(username);
		dr.findElement(By.name("user_password")).sendKeys(password,Keys.ENTER);
	}

}
