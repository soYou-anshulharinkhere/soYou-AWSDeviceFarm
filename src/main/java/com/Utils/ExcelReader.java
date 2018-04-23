package com.Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell cell;
	private static XSSFRow Row;

  public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   

   String[][] tabArray = null;

   try {

	   FileInputStream ExcelFile = new FileInputStream(FilePath);

	   // Access the required test data sheet

	   ExcelWBook = new XSSFWorkbook(ExcelFile);

	   ExcelWSheet = ExcelWBook.getSheet(SheetName);

	   int startRow = 1;

	   int startCol = 0;

	   int ci,cj;

	   int totalRows = ExcelWSheet.getLastRowNum();
	   Row = ExcelWSheet.getRow(1);
	   int colNum=Row.getLastCellNum();

	   // you can write a function as well to get Column count

	  // System.out.println(colNum);

	   tabArray=new String[totalRows][colNum];

	   ci=0;

	   for (int i=startRow;i<=totalRows;i++, ci++) {           	   

		  cj=0;

		   for (int j=startCol;j<colNum;j++, cj++){

			   tabArray[ci][cj]=getCellData1(i,j);

			  // System.out.println(tabArray[ci][cj]);  

				}

			}

		}

	catch (FileNotFoundException e){

		System.out.println("Could not read the Excel sheet");

		e.printStackTrace();

		}

	catch (IOException e){

		System.out.println("Could not read the Excel sheet");

		e.printStackTrace();

		}

	return(tabArray);

	}


public static String getCellData1(int rowNum,int colNum){
	try{
		if(rowNum <0)
			return "";
	
        cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
        if(cell.getCellType()==org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING)
        {
	    return cell.getStringCellValue();
        }
      else if(cell.getCellType()==org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC || cell.getCellType()==org.apache.poi.ss.usermodel.Cell.CELL_TYPE_FORMULA ){
	  DataFormatter fmt = new DataFormatter();
	 
	  String value=null;
	
          value = fmt.formatCellValue(cell);
         
          return value;
         
  }else if(cell.getCellType()==org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BLANK)
    {
      return "";
     }
  else 
	  return String.valueOf(cell.getBooleanCellValue());
	}
	catch(Exception e){
		
		e.printStackTrace();
		return "row "+rowNum+" or column "+colNum +" does not exist  in xls";
	}

}}

