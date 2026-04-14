package testCases;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

import java.util.Properties;


public class TC002_LoginTest extends BaseClass {

    @Test(priority = 2)
    public void loginTest() {

        logger.info("***  Starting TC002_loginTest   ***");
        try {
//HomePage
            HomePage hope = new HomePage(driver);
            hope.clickMyaccount();
            logger.info("*** Clicked on MyAccount link ***");
            hope.clickLogin();
            logger.info("*** clicked on Login link ***");
//Login Page
            LoginPage loginpage = new LoginPage(driver);
            loginpage.setEmail(p.getProperty("email"));
            logger.info("*** Enterted  Email ***");
            loginpage.setPassword(p.getProperty("password"));
            logger.info("*** entered Password ***");
            loginpage.clickLoginButton();
            logger.info("*** clicked Login Button ***");


            //Assert.assertTrue(targetpage);
        } catch (Exception e) {
            logger.error("Test Failed..", e);
            logger.debug("Debug logs.....");
            Assert.fail();
        }
        logger.info("*** Finished TC002_LoginTest ***");
    }
}