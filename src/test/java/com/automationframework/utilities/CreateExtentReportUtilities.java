package com.automationframework.utilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreateExtentReportUtilities {
	private static ExtentReports extentreports;
	private static ThreadLocal<ExtentTest> extentTestthread = new ThreadLocal<ExtentTest>();

	public static void setupExtentReport() {
		ExtentSparkReporter extentsparkreporter = new ExtentSparkReporter(
		System.getProperty("user.dir") + "//report.html");
		extentreports=new ExtentReports();
		extentreports.attachReporter(extentsparkreporter);

	}
	
	public static void createExtentTest(String name) {
		ExtentTest test= extentreports.createTest(name);
		extentTestthread.set(test);
	}
	
	
	public static ExtentTest getExtentTest() {
	 return extentTestthread.get();
	}
	
	public static void flush() {
		extentreports.flush();
	}

}
