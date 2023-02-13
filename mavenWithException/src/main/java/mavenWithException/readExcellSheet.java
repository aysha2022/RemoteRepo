package mavenWithException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.testng.annotations.DataProvider;

public class readExcellSheet {


public class RedExcel {
	FileInputStream f;
	XSSFWorkbook wb ;
	XSSFSheet sh;
	XSSFCell cell;
	Object [][] o;
	@Test
	public void logInTest(Object o,Object o1) {
		System.out.println(o);
		System.out.println(o1);
	}
	@DataProvider(name="dp")
	public Object[][] readExcel(String path) throws IOException {
		try {//first creating a Workbook, then getting a sheet from that workbook, 
			//then getting the cell from that sheet which is containing date value and
			//finally getting cell value from that cell. 

			f=new FileInputStream(new File(path));//
			wb=new XSSFWorkbook(f); // finds the workbook instance for xlsx file
			sh=wb.getSheetAt(0); // returns the first sheet getSheetAt()
			sh.getRow(2).getCell(2);//to get one cell(if required sets of data)
			int rn=sh.getLastRowNum();
			int sn=sh.getRow(0).getLastCellNum();
			o=new Object [rn][sn];
			for (int i=1;i<=rn;i++) {
				for(int j=0;j<sn;j++) {
					cell=sh.getRow(i).getCell(j);
					switch(cell.getCellType()) {//A cell can be any type e.g  String, numeric, boolean, etc, so we need to check the type of cell before reading, 
					//for that we have a switch case which checks the type before reading the specific cell value by calling getStringValue(), getNumericValue(), etc.
					//This is how exactly you can read XLSX file in java.
					case XSSFCell.CELL_TYPE_STRING:{
						o[i-1][j]=cell.getStringCellValue();
					}
					case XSSFCell.CELL_TYPE_NUMERIC:{
						o[i-1][j]=cell.getNumericCellValue();
					}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	
	
	
	
	
	
	

}

}
