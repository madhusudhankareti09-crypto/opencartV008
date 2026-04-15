package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {

    //Locators
    @FindBy(xpath="//a[text()='Tablets']")
    WebElement btn_tablets;
    @FindBy(xpath="//span[text()='Add to Cart']/following::button[1]")
    WebElement btn_addwishlist;
    @FindBy(xpath = "//span[text()='Wish List (1)']") WebElement  btn_wishlist;

    //Constractor call from Base page
    public WishListPage(WebDriver driver){super(driver);}

    public void clickTabletsButton(){btn_tablets.click();}
    public void clickAddWishlistButton(){btn_addwishlist.click();}
    public void clickWishlistButton(){btn_wishlist.click();}





}
