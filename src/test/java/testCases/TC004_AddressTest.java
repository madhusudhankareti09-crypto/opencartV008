package testCases;

import org.testng.annotations.Test;
import pageObjects.AddressPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC004_AddressTest extends BaseClass {

    @Test(priority = 4)
    public void addNewAddressTest() {
        logger.info("*** Starting TC004_addNewAddressTest ***");
        try {
            // Home Page
            HomePage hope = new HomePage(driver);
            hope.clickMyaccount();
            logger.info("*** Clicked on MyAccount link ***");
            hope.clickLogin();
            logger.info("*** clicked on Login button link ***");

            //LoginPage
            LoginPage loginPage=new LoginPage(driver);
            loginPage.setEmail("snYaH@gmail.com");
            loginPage.setPassword("fKQ$019");
            loginPage.clickLoginButton();

            //Address Page
            AddressPage addresspage = new AddressPage(driver);
            addresspage.clickAddressBookButton();
            addresspage.clicknewAddressButton();
            logger.info("*** clicked on New Address button link ***");
            addresspage.setTxt_firstName("Alfa");
            logger.info("*** entered FristName ***");
            addresspage.setTxt_lastName("Beta");
            logger.info("*** entered LastName ***");
            addresspage.setTxt_company("AlfaBeta Inc.");
            logger.info("*** entered Company ***");
            addresspage.setTxt_address1("123 Main Street");
            logger.info("*** entered Address1 ***");
            addresspage.setTxt_address2("Suite 456");
            logger.info("*** entered Address2 ***");
            addresspage.setTx_city("Metropolis");
            logger.info("*** entered city ***");
            addresspage.setTxt_postcode("12345");
            logger.info("*** entered PinCode ***");
            addresspage.setDrp_country("United States");
            logger.info("*** entered Country ***");
            addresspage.setDrp_state("New York");
            logger.info("*** entered State ***");
            addresspage.clickbtn_continue();

        } catch (Exception e) {
            logger.error("Test Failed..", e);
            logger.debug("Debug logs.....");
            assert false : "Test Failed due to exception: " + e.getMessage();
        }
    }
}