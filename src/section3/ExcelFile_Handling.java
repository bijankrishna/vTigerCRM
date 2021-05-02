package section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelFile_Handling {
	static WebDriver dr;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="E:\\selenium programs\\DataFiles\\commonDataLoginPage.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("LoginPageData");
//		Row r = sh.getRow(1);
//		Cell c = r.getCell(1);
//		String URl = c.getStringCellValue();
		Row r1 = WorkbookFactory.create(fis).getSheet("LoginPageData").getRow(1);
		String browser=r1.getCell(0).getStringCellValue();
		String url= r1.getCell(1).getStringCellValue();
		String username=r1.getCell(2).getStringCellValue();
		String password=r1.getCell(3).getStringCellValue();
		double numericValue = r1.getCell(4).getNumericCellValue();
		//if u change excel property into text format then numeric will also save as text also and we can put variable as string
		
		System.out.println("numeric value :-"+numericValue);
		System.out.println("browser:-"+browser);
		System.out.println("url :-"+url);
		System.out.println("username :-"+username);
		System.out.println("password :-"+password);
		
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
