package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readExcel(String filename) throws IOException {
		
		XSSFWorkbook book=new XSSFWorkbook("./data/"+filename+".xlsx");		
		XSSFSheet sheetAt = book.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(0);
		int rowCount = sheetAt.getLastRowNum();
		int colCount = row.getLastCellNum();
		
		String[][] data=new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<colCount;j++) {				
				//Testleaf=getRow(1).getCell(0)
				String cellValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
				//data[i][j]=cellValues;
				//data[1][0]=Testleaf;
				//dat[0][0]=Testleaf
				//i-1 right, since i =1	
				//we get from row 1 in excel, in array we need to store as 0 th index
			data[i-1][j]=cellValues;
			//dats[1-1][0]=Testleaf
			//data[2-1][0]=Qeagle
			}
		}	
		
		//close the book (Mandatory step)
		book.close();
		return data;
	}
	
	
	
	
}
