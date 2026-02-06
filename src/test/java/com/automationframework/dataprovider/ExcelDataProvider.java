package com.automationframework.dataprovider;

import java.util.Iterator;

import org.testng.annotations.DataProvider;

import com.automationframework.utilities.ExcelReaderUtility;
import com.automationtestframework.pojo.User;

public class ExcelDataProvider {
	
	@DataProvider(name="LoginDataProvider")
     public Iterator<User> loginDataProvider() {
    	return  ExcelReaderUtility.ReadExcel();
     }
}
