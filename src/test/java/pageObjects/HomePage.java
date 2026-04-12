package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    //Locaters
    @FindBy(xpath = "//a[@title='My Account']")
    WebElement linkmyAccount;
    @FindBy(xpath = "//a[text()='Register']")
    WebElement linkregister;
    @FindBy(xpath = "//a[text()='Login']")
    WebElement link_login;

    //Calling Constructer from BasePage
    public HomePage(WebDriver driver) {
        super(driver);

    }

    //Action Methods
    public void clickMyaccount() {
        linkmyAccount.click();
    }

    public void clickregister() {
        linkregister.click();
    }

    public void clickLogin() {
        link_login.click();
    }


}
