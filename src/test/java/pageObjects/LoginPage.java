package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txt_eMail;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txt_password;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement btn_login;


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void setEmail(String email) {
        txt_eMail.sendKeys(email);
    }

    public void setPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void clickLoginButton() {
        btn_login.click();
    }
}
