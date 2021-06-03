package JavaStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class JavaStreamReadExcel {

	public static void main(String[] args) throws IOException {
	
		File f = new File ("C:\\Users\\April\\Documents\\PENG\\Cara Mia - Design and User Flow Comments.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fi);
		
		Sheet sheet1 = workbook.getSheetAt(0);
		Row row1 = sheet1.getRow(1);
		Cell cellA = row1.getCell(1);
		
		System.out.println(cellA);
		
		fi.close();
		
		
	

	}

}
