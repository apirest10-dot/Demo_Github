package feb23;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alternate_Method {

	public static void main(String[] args) throws Throwable{
		// read excel path
		FileInputStream fi = new FileInputStream("D:/MyFile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println(rc); 
		//print specific row from sheet
		String fname =ws.getRow(12).getCell(0).getStringCellValue();
		String mname = ws.getRow(1).getCell(1).getStringCellValue();
		String lname = ws.getRow(8).getCell(2).getStringCellValue();
		int eid =(int) ws.getRow(9).getCell(3).getNumericCellValue();
		System.out.println(fname+"    "+mname+"     "+lname+"       "+eid);
		fi.close();
		wb.close();
		
	}

}
