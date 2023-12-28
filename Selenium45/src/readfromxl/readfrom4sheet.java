package readfromxl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readfrom4sheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File abspath=new File("./resources/dec11.xlsx");
		FileInputStream fis=new FileInputStream(abspath);
		
		Workbook work=WorkbookFactory.create(fis);
		
		String data1 = work.getSheet("Sheet1").getRow(7).getCell(3).getStringCellValue();
		LocalDateTime data2 = work.getSheet("Sheet1").getRow(10).getCell(6).getLocalDateTimeCellValue();
		boolean data3 = work.getSheet("Sheet1").getRow(13).getCell(1).getBooleanCellValue();
		double data4 = work.getSheet("Sheet1").getRow(14).getCell(4).getNumericCellValue();
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println();
		
		String data5 = work.getSheet("Sheet2").getRow(9).getCell(2).getStringCellValue();
		boolean data6 = work.getSheet("Sheet2").getRow(6).getCell(5).getBooleanCellValue();
		LocalDateTime data7 = work.getSheet("Sheet2").getRow(11).getCell(4).getLocalDateTimeCellValue();
		double data8 = work.getSheet("Sheet2").getRow(16).getCell(1).getNumericCellValue();
		System.out.println(data5);
		System.out.println(data6);
		System.out.println(data7);
		System.out.println(data8);

	}

}
