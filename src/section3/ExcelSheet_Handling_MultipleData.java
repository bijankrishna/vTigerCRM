package section3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_Handling_MultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="E:\\selenium programs\\DataFiles\\Practice1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Demo1");
		for(int i=1;i<=20;i++)
		{
			System.out.println("Username :-"+sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println("Password :-"+sheet.getRow(i).getCell(1).getStringCellValue());
		}
	}

}
