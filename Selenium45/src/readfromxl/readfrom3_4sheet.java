package readfromxl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readfrom3_4sheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File abspath=new File("./resources/dec11.xlsx");
		FileInputStream fis=new FileInputStream(abspath);
		
		Workbook work=WorkbookFactory.create(fis);
		
		String data1 = work.getSheet("Sheet3").getRow(11).getCell(1).getStringCellValue();
		boolean data2 = work.getSheet("Sheet3").getRow(14).getCell(5).getBooleanCellValue();
		LocalDateTime data3 = work.getSheet("Sheet3").getRow(15).getCell(3).getLocalDateTimeCellValue();
		double data4 = work.getSheet("Sheet3").getRow(17).getCell(1).getNumericCellValue();
		
		String data5 = work.getSheet("Sheet4").getRow(8).getCell(1).getStringCellValue();
		double data6 = work.getSheet("Sheet4").getRow(10).getCell(7).getNumericCellValue();
		LocalDateTime data7 = work.getSheet("Sheet4").getRow(12).getCell(2).getLocalDateTimeCellValue();
		boolean data8 = work.getSheet("Sheet4").getRow(14).getCell(3).getBooleanCellValue();
		
        System.out.println(data1+" "+data2+" "+data3+" "+data4);
        
        
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println();
		System.out.println(data5);
		System.out.println(data6);
		System.out.println(data7);
		System.out.println(data8);
	}

}
