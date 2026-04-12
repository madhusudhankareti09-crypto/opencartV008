package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.TestDataFactory;

//loginEmail snYaH@gmail.com
//loginpassword fKQ$019

public class TC001_AccountRegistrationTest extends BaseClass {


    @Test(priority = 1)
    public void account_register_test() {

        logger.info("*** Strating TC001_AccountRegistrationTest ***");
        try {
            HomePage hope = new HomePage(driver);
            hope.clickMyaccount();
            logger.info("*** Clicked on MyAccount link ***");
            hope.clickregister();
            logger.info("*** clicked on Register link ***");


            AccountRegistrationPage regpag = new AccountRegistrationPage(driver);
            logger.info("*** Providing Customer Details ***");
            regpag.setFirstName(TestDataFactory.randomString().toUpperCase());
            regpag.setLastName(TestDataFactory.randomString().toUpperCase());
            String gmail = TestDataFactory.randomString() + "@gmail.com";
            regpag.setEmail(gmail);
            System.out.println("loginEmail " + gmail);
            regpag.setTelephone(TestDataFactory.randomNumber());
            String password = TestDataFactory.randomeAlfaNumberic();
            regpag.setPassword(password);
            regpag.setPasswordConfirm(password);
            System.out.println("loginpassword " + password);
            regpag.setNewsletter();
            regpag.setAgree();
            regpag.btn_continues();
            logger.info("*** Validating Expected Messages... ***");
            String confirmMsg = regpag.getConfirmationMsg();
            if (confirmMsg.equals("Your Account Has Been Created!")) {
                Assert.assertTrue(true);
            } else {
                logger.error("Account Registration Failed..");
                Assert.assertTrue(false);
            }
            regpag.clickContinueButton();
            regpag.btn_MyAccount();
            regpag.btn_Logout();

//            LoginPage loginpage = new LoginPage(driver);
//            loginpage.clickMyaccount();
//            loginpage.clickLogin();
//            loginpage.setEmail(gmail);
//            System.out.println("loginEmail " + gmail);
//            loginpage.setPassword(password);
//            System.out.println("loginpassword " + password);
//            loginpage.clickLoginButton();


        } catch (Exception e) {
            logger.error("Test Failed..", e);
            logger.debug("Debug logs.....");
            Assert.fail();
        }
        logger.info("*** Finished TC001_AccountRegistrationTest ***");
    }
}

