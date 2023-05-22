package ExcelData.DataProvider;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter; 

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

public class New {
	DataFormatter formatter=new DataFormatter();
	
	 @Test(dataProvider="driverTest")
	 public void testCaseData(String greeeting,String communication,String id) {
	  System.out.println(greeeting+communication+id);
	  
	  
	 }
	 
	 @DataProvider(name="driverTest")
	 public Object[][] getData() throws IOException {
	  
	  //Object[][] data= {{"hello","text","1"},{"bye","message","2"},{"solo","call","3"}};
	  //return data;
	  FileInputStream file=new FileInputStream("C:\\Users\\prave\\Desktop\\Dhareene\\DataProviderExcel.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(file);	  
	  XSSFSheet sheet=wb.getSheetAt(0);
	  int rowCount=sheet.getPhysicalNumberOfRows();
	  XSSFRow row=sheet.getRow(0);
	  int colcount=row.getLastCellNum();
	  Object data[][]=new Object[rowCount-1][colcount];
	  for (int i=0;i<rowCount-1;i++) {
		  row=sheet.getRow(i+1);
		  for (int j=0;j<colcount;j++) {
			 XSSFCell cell=row.getCell(j);
			data[i][j]=  formatter.formatCellValue(cell);
		  }
	  }
	  
	  return data;
	  
	  
	 }

	
}
