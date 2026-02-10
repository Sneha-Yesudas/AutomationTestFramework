package com.automationframework.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.automationtestframework.constants.Env;

public class ReadPropertyFile {

	public static String ReadPropertyFile(Env env) {

		File file = new File(System.getProperty("user.dir") + "//Env//"+env+".properties");
		FileReader fileReader;
		Properties properties = null;
		try {
			 fileReader = new FileReader(file);
			 properties = new Properties();
			properties.load(fileReader);
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty("URL");

	}

}
