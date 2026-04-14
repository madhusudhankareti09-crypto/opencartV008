package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.TestDataFactory;
import com.github.javafaker.Faker;


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
            Faker faker = new Faker();
            regpag.setFirstName(faker.name().firstName());
            logger.info("*** entered FristName ***");
            regpag.setLastName(faker.name().lastName());
            logger.info("*** entered lastName ***");
            regpag.setEmail(faker.internet().emailAddress());
            logger.info("*** entered emailAddress ***");
            regpag.setTelephone(faker.phoneNumber().phoneNumber());
            logger.info("*** entered phoneNumber ***");
            String password = faker.internet().password();
            regpag.setPassword(password);
            logger.info("*** entered password ***");
            regpag.setPasswordConfirm(password);
            logger.info("*** entered Re-Password ***");
            regpag.setNewsletter();
            logger.info("*** entered Newsletter ***");
            regpag.setAgree();
            logger.info("*** clicked setAgree button ***");
            regpag.btn_continues();

            String confirmMsg = regpag.getConfirmationMsg();
            if (confirmMsg.equals("Your Account Has Been Created!")) {
                Assert.assertTrue(true);
            } else {
                logger.error("Account Registration Failed..");
                Assert.assertTrue(false);
            }
            regpag.clickContinueButton();
            regpag.btn_MyAccount();
            logger.info("*** clicked on Myaccount button ***");
            regpag.btn_Logout();
            logger.info("*** clicked Logout button ***");
            logger.info("*** Validating Expected Messages... ***");



        } catch (Exception e) {
            logger.error("Test Failed..", e);
            logger.debug("Debug logs.....");
            Assert.fail();
        }
        logger.info("*** Finished TC001_AccountRegistrationTest ***");
    }
}

