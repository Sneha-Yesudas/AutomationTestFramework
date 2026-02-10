package com.automationtestframework.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automationframework.utilities.BrowserUtilities;
import com.automationframework.utilities.CreateExtentReportUtilities;
import com.automationtestframework.test.TestBase;
import com.aventstack.extentreports.Status;

public class TestListener implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		CreateExtentReportUtilities.setupExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		CreateExtentReportUtilities.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {

		CreateExtentReportUtilities.createExtentTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		CreateExtentReportUtilities.getExtentTest().log(Status.SKIP, result.getThrowable().getMessage());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		CreateExtentReportUtilities.getExtentTest().log(Status.FAIL, result.getThrowable().getMessage());
		Object testclass = result.getInstance();
		BrowserUtilities bw = ((TestBase) testclass).getInstance();
		String path = bw.takeScreenshot();
		CreateExtentReportUtilities.getExtentTest().addScreenCaptureFromPath(path);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		CreateExtentReportUtilities.getExtentTest().log(Status.PASS, result.getMethod().getMethodName());
	}

}
