package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readDataFromExcel() throws IOException {
		//Specify the path of excel
		File src= new File("C:\\Users\\AVUR08744\\Desktop\\ExcelBook1.xlsx");
		//load data in  the background
		FileInputStream fis= new FileInputStream(src);
		//load workbook
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//Load sheet
		XSSFSheet sh= wb.getSheet("MST");
		System.out.println(sh.getSheetName());
		String s= sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data coming from excel sheet is :" +s);
		
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getPhysicalNumberOfRows());

		System.out.println(sh.getRow(1).getLastCellNum());

		System.out.println(sh.getRow(1).getPhysicalNumberOfCells());

	}
	}


