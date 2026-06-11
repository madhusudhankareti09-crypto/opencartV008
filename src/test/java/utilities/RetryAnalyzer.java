package utilities;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int retryCount = 0;
    int maxRetry = 2;

    @Override
    public boolean retry(ITestResult result) {

        Throwable throwable = result.getThrowable();

        if ((throwable instanceof TimeoutException
                || throwable instanceof WebDriverException)
                && retryCount < maxRetry) {

            retryCount++;

            System.out.println("Retrying Test : " + result.getName());

            return true;
        }

        return false;
    }
}