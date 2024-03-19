package ExtendsReport;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.DateAndTime;

public class ExtendsReportGenerator {
	

	public static ExtentReports getExtendsReport() {
        ExtentReports reports=new ExtentReports();
		
		File extentReportFile=new File(System.getProperty("user.dir")+"\\ExtentsReport\\"+DateAndTime.Time()+"eReport.html");
		ExtentSparkReporter SparksReporter=new ExtentSparkReporter(extentReportFile);
		reports.attachReporter(SparksReporter);
		return reports;
	}

}
