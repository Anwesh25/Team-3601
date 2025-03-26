package com_ExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports implements ITestListener{
	
	public ExtentSparkReporter report;
	//It provides the Basic Information of the document--> (report name,document title, theme of the report)
	public ExtentReports extent;
	// It provides the Basic Inforamtion of the User --> (Username,hostname,OS,browser,Environment)
	public ExtentTest test;
	// It provides the basic information about TestCases --> Pass,failed,skipped
	
	
	//pre-defined methods (onStart,onTestSuccess,onTestFaiure,onTestSkipped,onFinish)
	
	public void onStart(ITestContext tr) {
		report = new ExtentSparkReporter("C:\\Users\\Personal\\Desktop\\LMS\\LMS_Backend\\LMS_backend_code\\ACE_3602\\ExtentReport01\\Ada_Hotel.html");
		
		report.config().setDocumentTitle("Adactin Hotel");
		report.config().setReportName("Adactin- Login-Search Hotel");
		report.config().setTheme(Theme.STANDARD);
		
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		
		extent.setSystemInfo("Username", "anwesh");
		extent.setSystemInfo("Hostname", "Local Host");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Environment", "QA");
	}
	
	public void onTestSuccess(ITestResult tr) {
		test = extent.createTest(tr.getName());
		
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult tr) {
		test = extent.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	}
	
	public void onTestSkipped(ITestResult tr) {
		test = extent.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.YELLOW));
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}







