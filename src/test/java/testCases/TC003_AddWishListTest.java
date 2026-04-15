package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WishListPage;
import testBase.BaseClass;

public class TC003_AddWishListTest extends BaseClass {

    @Test(priority = 3)
    public void add_wishlist_test() {
        logger.info("*** Starting TC003_AddWishListTest ***");
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
            logger.info("*** Entered Email ***");
            loginPage.setPassword("fKQ$019");
            logger.info("*** clicked on Password ***");
            loginPage.clickLoginButton();
            logger.info("*** clicked on Login button link ***");

           //Wish List Page
            WishListPage wish = new WishListPage(driver);
            wish.clickTabletsButton();
            logger.info("*** Clicked on Tablets button ***");
            wish.clickAddWishlistButton();
            logger.info("*** Clicked on Add to Wishlist button ***");
            wish.clickWishlistButton();
            logger.info("*** Clicked on Wishlist button ***");

        } catch (Exception e) {
            logger.error("Test Failed..", e);
            logger.debug("Debug logs.....");
            Assert.fail();
        }
        logger.info("*** Finished TC003_AddWishListTest ***");
    }
}