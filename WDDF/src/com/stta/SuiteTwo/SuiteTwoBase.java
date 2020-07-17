package com.stta.SuiteTwo;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.stta.TestSuiteBase.SuiteBase;

//SuiteTwoBase Class Inherits From SuiteBase Class.
//So, SuiteTwoBase Class Is Child Class Of SuiteBase Class.
public class SuiteTwoBase extends SuiteBase{	

	static ExtentHtmlReporter htmlReporter;
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeSuite
	public void checkSuiteToRun() throws IOException{		
		//Called init() function from SuiteBase class to Initialize .xls Files
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "\\ExtentReportResults.html");
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
	}
}
