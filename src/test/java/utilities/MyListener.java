package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import testBase.BaseClass;

public class MyListener implements ITestListener {

    ExtentReports extent = ExtentReportManager.getReporter();

    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getName());

        System.out.println("Test Started : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");

        System.out.println("Test Passed : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        String imgPath = ScreenshotUtil.captureScreen(
                BaseClass.driver,
                result.getName());

        try {

            test.addScreenCaptureFromPath(imgPath);

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println("Screenshot captured for failed test");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.skip("Test Skipped");

        System.out.println("Test Skipped : " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

        System.out.println("Extent Report Generated");
    }
}