package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public ArrayList<String> getData() throws IOException
	
	{
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fil = new FileInputStream("D:\\New folder\\DataDriven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fil);
		int sheets=0;
		//finding the total number of sheets----returned 8 sheets
		sheets=wb.getNumberOfSheets();
		System.out.println(sheets);
		//return null;
		//getting the correct sheet by iterating through 8 sheets
		for(int i=0;i<sheets;i++)
		{
			if(wb.getSheetName(i).equalsIgnoreCase("Smoke"))
			{
				XSSFSheet sheet= wb.getSheetAt(i);			
				Iterator<Row> rows=sheet.rowIterator();//get access to the specific row
			    Row firstrow = rows.next();//will give me the first row in the sheet
				//I  will iterate through the first row to find the heading "TestCases"
			    //ExcelWorkbook---->Sheet--->Row------>Cell
			    Iterator<Cell> cel=firstrow.cellIterator();//This line of code will scan the cells in the first row
			    int column=0;int k=0;
			    while(cel.hasNext())
			    {
			    	Cell value=cel.next();
			    	if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
			    	{
			    		column=k;
			    		System.out.println(column);
			    	}
			    	k++;
			    }
			    while(rows.hasNext())
			    {
			    	Row r = rows.next();
			    	
			    	if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Login"))
			    	
			    	{
			    	     Iterator<Cell> cell = r.cellIterator();
			    	     cell.next();
			    	     while(cell.hasNext())
			    	     {
			    	    	 a.add(cell.next().getStringCellValue());
			    	     }
			    	}
			    }
			    
			    
			}
		}
		return a;
		
	}
}
