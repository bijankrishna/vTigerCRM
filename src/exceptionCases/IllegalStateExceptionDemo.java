package exceptionCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IllegalStateExceptionDemo {

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
		String numericValue = r1.getCell(4).getStringCellValue();
		System.out.println("numeric value :-"+numericValue);
		System.out.println("browser:-"+browser);
		System.out.println("url :-"+url);
		System.out.println("username :-"+username);
		System.out.println("password :-"+password);
	}

}
