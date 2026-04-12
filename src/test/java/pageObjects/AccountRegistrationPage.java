package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountRegistrationPage extends BasePage {

    // ==============================
    // 1. Locaters
    // ==============================
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement txt_firstName;
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement txt_lastName;
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txt_eMail;
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement txt_telephone;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txt_password;
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement txt_passwordConfirm;
    @FindBy(xpath = "//input[@value='0']")
    WebElement radio_newsletter;
    @FindBy(xpath = "//input[@name='agree']")
    WebElement chk_agree;
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btn_continues;
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement txt_ConfirmationMessage;
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement btn_Continue;
    @FindBy(xpath = "//a[@title='My Account']")
    WebElement btn_MyAccount;
    @FindBy(xpath = "//a[text()='Downloads']/parent::li/following::li//a[text()='Logout']")
    WebElement btn_Logout;


    // ==============================
    // 2. Constructer calling from BasePage
    // ==============================

    public AccountRegistrationPage(WebDriver driver) {
        super(driver);

    }


    // ==============================
    // 3. Action Methods
    // ==============================
    public void setFirstName(String fName) {
        txt_firstName.sendKeys(fName);
    }

    public void setLastName(String lName) {
        txt_lastName.sendKeys(lName);
    }

    public void setEmail(String email) {
        txt_eMail.sendKeys(email);
    }

    public void setTelephone(String tel) {
        txt_telephone.sendKeys(tel);
    }

    public void setPassword(String paw) {
        txt_password.sendKeys(paw);
    }

    public void setPasswordConfirm(String paw) {
        txt_passwordConfirm.sendKeys(paw);
    }

    public void setNewsletter() {
        radio_newsletter.click();
    }

    public void setAgree() {
        chk_agree.click();
    }

    public void btn_continues() {
        btn_continues.click();
    }

    public void clickContinueButton() {
        btn_Continue.click();
    }
    public void btn_MyAccount() {
        btn_MyAccount.click();
    }
    public void btn_Logout() {
        btn_Logout.click();
    }

    // ==============================
    // 4. Validation Methods
    // ==============================
    public String getConfirmationMsg() {
        try {
            return (txt_ConfirmationMessage.getText());
        } catch (Exception e) {
            return (e.getMessage());
        }
    }
}





