package feb23;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable{
		// Read file path
		FileInputStream fi = new FileInputStream("D:/MyFile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++)
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String mname = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			int eid = (int) ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+"    "+mname+"     "+lname+"       "+eid);
			//create status cell and write some text
			ws.getRow(i).createCell(4).setCellValue("Fail");
			
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/MyResults.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		

	}

}
