package section3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_Handling_SetCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="E:\\selenium programs\\DataFiles\\Practice1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Demo3");
		String Value = sheet.getRow(5).getCell(3).getStringCellValue();
		System.out.println(Value);
		
		sheet.getRow(5).getCell(3).setCellValue("Good Night");
		
		FileOutputStream fos=new FileOutputStream(path);
		book.write(fos);
		fos.flush();
		
		String Value2 = sheet.getRow(5).getCell(3).getStringCellValue();

		System.out.println(Value2);
		
		
	}

}
