package section3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_Handling_WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path="E:\\selenium programs\\DataFiles\\Practice1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Demo3");
		sheet.createRow(6).createCell(4).setCellValue("Bye Bye");
		
		FileOutputStream fos=new FileOutputStream(path);
		book.write(fos);
		fos.flush();
		System.out.println("pass");
	}

}
