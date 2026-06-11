package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AlertHomePage;
import pageObjects.iFrameHomePage;
import testBase.BaseClass;

public class TC006_iFrameTest extends BaseClass {

    @Test(priority = 6,groups = {"smoke"})
    public void iFrameTest() {
        logger.info("***  Starting TC006_iFrameTest   ***");
        try {
//HomePage1
            iFrameHomePage ifr = new iFrameHomePage(driver);
            ifr.clickSkipSignbtn();
            logger.info("Clicked on The Skip Button");
            ifr.clicksingleframe();
            logger.info("iFrame Page Opened");
            logger.info("*** Handled Single iFrame ***");
            ifr.entertext();
            logger.info("entered text inside iFrame");
            ifr.clickNestedframe();
            logger.info("*** Handled Nested iFrame ***");
            ifr.entertext();
            logger.info("entered text inside iFrame");

        } catch (Exception e) {
            logger.error("Test Failed..", e);
            logger.debug("Debug logs.....");
            Assert.fail();
        }
        logger.info("*** Finished TC006_iFrameTest ***");


    }
}