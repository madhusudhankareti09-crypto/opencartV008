package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.WindowHandlingPage;
import pageObjects.iFrameHomePage;
import testBase.BaseClass;

import static utilities.ScreenshotUtil.captureScreen;

public class TC007_WindowHandlingTest extends BaseClass {
    @Test(priority = 7, groups = {"smoke"})
    public void WindowHandlingTest() {
        logger.info("***  Starting TC007_WindowHandlingTest   ***");
        try {
//HomePage1
            WindowHandlingPage whp = new WindowHandlingPage(driver);
            whp.skipPage();
            logger.info("Clicked on The Skip SignIn Button");
            logger.info("Clicked on Switch drop down");
            logger.info("Clicked Windows Option");
            whp.openTabNewWindow();
            logger.info("Clicked New TabWindows Option");
            logger.info("Clicked on Parent TabWindows click button");
            logger.info("Handled Multiple Tab Windows");
            whp.openNewWindow();
            logger.info("Handled Separate Multiple Tab Windows");

        } catch (Exception e) {
            logger.error("Test Failed..", e);
            logger.debug("Debug logs.....");

            Assert.fail(e.getMessage());
        }
        logger.info("*** Finished TC007_WindowHandlingTest ***");


    }
}
