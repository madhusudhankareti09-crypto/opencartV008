package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

   // @FindBy(xpath = "//h2[text()='My Account']")
    //WebElement msgHeading;
    @FindBy(xpath = "//a[text()='Tablets']")
    WebElement btn_tablets;
    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']/following::span[7]")
    WebElement btn_addToCart;
    @FindBy(xpath = "//span[@id='cart-total']")
    WebElement btn_cartTotal;
    @FindBy(xpath = "//strong[normalize-space()='View Cart']")
    WebElement viewCart;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkout;


//    public boolean IsMyAccountExists() {
//        try {
//            return (msgHeading.isDisplayed());
//        } catch (Exception e) {
//            return (false);
//        }
//    }

    public void clickTabletsButton() {
        btn_tablets.click();
    }

    public void clickAddToCartButton() {
        btn_addToCart.click();
    }

    public void clickCartTotalButton() {
        btn_cartTotal.click();
    }

    public void clickViewCartButton() {
        viewCart.click();
    }

    public void clickCheckoutButton() {
        checkout.click();
    }
}