package com.automationframework.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.automationtestframework.pojo.User;

public class ExcelReaderUtility {

	public static Iterator<User> ReadExcel() {
		File file =new File(System.getProperty("user.dir")+"//testdata//testdata.xlsx");
		XSSFWorkbook xssfWorkbook;
		XSSFSheet xssfSheet;
		Iterator<Row> iteratorRow;
		Row row;
		List<User> userList=new ArrayList<User>();
		try {
			 xssfWorkbook=new XSSFWorkbook(file);
			 xssfSheet=xssfWorkbook.getSheet("Sheet1");
			 iteratorRow=xssfSheet.iterator();
			 iteratorRow.next();
			while(iteratorRow.hasNext())
			{
				 row=iteratorRow.next();
				Cell cell1=row.getCell(0);
				Cell cell2=row.getCell(1);
				System.out.println(cell1.toString());
				System.out.println(cell2.toString());
				User user=new User(cell1.toString(), cell2.toString());
				userList.add(user);
				System.out.println(userList.size());
			}
					
			
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userList.iterator();
	}

}
