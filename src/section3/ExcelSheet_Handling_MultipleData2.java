package section3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_Handling_MultipleData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.out.println("mms");
		String path="E:\\selenium programs\\DataFiles\\Practice1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Demo2");
		int lastRowNum = sheet.getLastRowNum();//count start from 0
		for(int i=0;i<=lastRowNum;i++)
		{
			Row row = sheet.getRow(i);
			short lastCellNum = row.getLastCellNum();//count start from 1
			for(int j=0;j<lastCellNum;j++)
			{
				Cell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue()+"  ");
				
			}
			System.out.println();
		}
	}

}
