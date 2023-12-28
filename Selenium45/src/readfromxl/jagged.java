package readfromxl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class jagged {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File abspath=new File("./resources/jagged.xlsx");
		FileInputStream fis=new FileInputStream(abspath);
		
		Workbook work=WorkbookFactory.create(fis);
		
		int rowcount = work.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cellcount = work.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		
		String[][] arr= new String[rowcount][cellcount];
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				arr[i][j]=work.getSheet("Sheet1").getRow(i).getCell(j).toString();
				System.out.println(arr[i][j]);
			}
		}
		
		
		
	}

}
