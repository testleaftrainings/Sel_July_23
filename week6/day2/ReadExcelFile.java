package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		
	//	Step:1 Create a excel file and attach to the project
		
	 //Step:2 ->Set path of the file to read the data
		
		XSSFWorkbook book=new XSSFWorkbook("./data/Lead.xlsx");
		
		//Step:3 -->Identify the sheet from book
		
		XSSFSheet sheetAt = book.getSheetAt(0);//reperesnts sheet 1 in Excel file , Index starts with zero
		
		//Stpe:4 -->Identify the row
		XSSFRow row = sheetAt.getRow(2);
		
		//Step:5 -->identitfy the cell
		
		XSSFCell cell = row. getCell(0); //[1,0]-->Testleaf 1A
		
		String stringCellValue = cell.getStringCellValue();
		
		System.out.println(stringCellValue);
		
		//to get the count of the rows that have data 
		int rowCount = sheetAt.getLastRowNum();
		
		//to count the no of col w.r.t row 
		int colCount = row.getLastCellNum();
		
		//Book-->sheet->row->col->cellValue
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<colCount;j++) {				
				String data = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				
			}
		}
		
		
		
		
		
		
		
	}

}
