package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AlertHomePage;
import pageObjects.HomePage;
import pageObjects.AlertHomePage;
import pageObjects.WindowHandlingPage;
import testBase.BaseClass;

public class TC005_AlertsTest extends BaseClass {

    @Test(priority = 5,groups = {"smoke"})
    public void alertTest() {
        logger.info("***  Starting TC005_AlertsTest   ***");
        try {
//HomePage1

           AlertHomePage al = new AlertHomePage(driver);
            al.skipPage();
            logger.info("Clicked on The Skip SignIn Button");
            logger.info("Clicked on Switch drop down");
            logger.info("Clicked Windows Option");

            al.clickSimpleAlert();
            logger.info("*** Handled Simple Alert ***");
            al.clickConfirmAlert_Ok();
            logger.info("*** Handled Confirmation Alert for Ok button ***");
            al.clickConfirmAlert_Cancel();
            logger.info("*** Handled Confirmation Alert for Cancel button***");
            al.clickPromptAlert_Ok();
            logger.info("*** Handled Prompt Alert clicked on Ok Button ***");
            al.clickPromptAlert_Cancel();
            logger.info("*** Handled Prompt Alert clicked on Cancel Button ***");


        } catch (Exception e) {
            logger.error("Test Failed..", e);
            logger.debug("Debug logs.....");
            Assert.fail();
        }
        logger.info("*** Finished TC005_AlertsTest ***");


    }
}

