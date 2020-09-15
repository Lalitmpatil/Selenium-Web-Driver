import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Add Dependencies of poi and poi-ooxml in POM.XML
		// Create object of File input stream and given location of the file
		// Create the object of workbook means as per the excel file extension
		// Sheet is the collection of rows
		// Rows are collection of cells.

		FileInputStream fis = new FileInputStream("C:\\Users\\lalit\\Desktop\\Selenium Udemy\\DemoExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// it show the count of the sheets present in workbook
		int sheets = workbook.getNumberOfSheets();
		System.out.println(sheets);

		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equals("Login")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				Row rw = row.next();

				Iterator<Cell> cell = rw.cellIterator();
				int columnvalue = 0;
				while (cell.hasNext()) {
					Cell cellvalue = cell.next();
					if (cellvalue.getStringCellValue().equals("Data1")) {
						while(row.hasNext())
						{
							Row rw1 = row.next();
							System.out.println(rw1.getCell(columnvalue).getStringCellValue());
						}
					}
					columnvalue++;

				}
				System.out.println(columnvalue);
			}
		}
	}

}
