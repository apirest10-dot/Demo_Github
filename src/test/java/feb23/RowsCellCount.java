package feb23;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class RowsCellCount {
	public static void main(String[] args) throws Throwable {
		// Read path of excel
		FileInputStream fi = new FileInputStream("D:/MyFile.xlsx");
		//get workbook from above file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Emp");
		//get first row from sheet
		XSSFRow row = ws.getRow(0);
		//count no of cells in first row
		int cc = row.getLastCellNum();
		//count no of rows in a sheet
		int rc = ws.getLastRowNum();
		System.out.println("No of cells are  "+cc);
		System.out.println("No of rows are  "+rc);
		fi.close();
		wb.close();
		}
}
