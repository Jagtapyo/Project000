package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	public static String getData(int row,int cell ) throws EncryptedDocumentException, IOException{
		FileInputStream file= new FileInputStream("F:\\Yoclasssjava\\maven1\\src\\test\\resources\\Book1.xlsx");
		String a = WorkbookFactory.create(file).getSheet("Parameterrr").getRow(row).getCell(cell).getStringCellValue();
        return a;	
	}
	

}