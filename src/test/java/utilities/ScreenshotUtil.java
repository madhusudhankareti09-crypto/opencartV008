package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreen(WebDriver driver, String testName) {

        String targetFilePath = "";

        try {

            String timeStamp =
                    new SimpleDateFormat("yyyyMMddhhmmss")
                            .format(new Date());

            TakesScreenshot ts = (TakesScreenshot) driver;

            File sourceFile =
                    ts.getScreenshotAs(OutputType.FILE);

            targetFilePath =
                    System.getProperty("user.dir")
                            + File.separator
                            + "screenshots"
                            + File.separator
                            + testName + "_" + timeStamp + ".png";

            File targetFile = new File(targetFilePath);

            FileUtils.copyFile(sourceFile, targetFile);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return targetFilePath;
    }
}