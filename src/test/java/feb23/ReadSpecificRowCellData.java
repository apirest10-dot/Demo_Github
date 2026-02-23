package feb23;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadSpecificRowCellData {
public static void main(String[] args)throws Throwable {
		// Read excel path
		FileInputStream fi = new FileInputStream("D:/MyFile.xlsx");
		//get workbook from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Emp");
		//get no of rows from sheet
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		//get specific row from sheet
		XSSFRow row = ws.getRow(10);
		//get each row cell
		XSSFCell fn =row.getCell(0);
		XSSFCell mn = row.getCell(1);
		XSSFCell ln = row.getCell(2);
		XSSFCell ei = row.getCell(3);
		String fname =fn.getStringCellValue();
		String mname = mn.getStringCellValue();
		String lname = ln.getStringCellValue();
		int eid = (int) ei.getNumericCellValue();
		System.out.println(fname+"    "+mname+"     "+lname+"       "+eid);
		fi.close();
		wb.close();
			}

}
