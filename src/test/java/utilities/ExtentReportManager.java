package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports getReporter() {

        String timeStamp =
                new SimpleDateFormat("yyyyMMddhhmmss")
                        .format(new Date());

        String reportPath =
                System.getProperty("user.dir")
                        + "/reports/MyReport_" + timeStamp + ".html";

        ExtentSparkReporter sparkReporter =
                new ExtentSparkReporter(reportPath);

        sparkReporter.config().setReportName("Automation Test Report");
        sparkReporter.config().setDocumentTitle("Selenium Framework");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Tester", "Madhusudhan");
        extent.setSystemInfo("Environment", "QA");

        return extent;
    }
}