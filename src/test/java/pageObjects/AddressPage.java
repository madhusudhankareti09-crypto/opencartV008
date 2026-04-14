package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage {


    //Locators
    @FindBy(xpath = "//a[text()='Address Book']")
    WebElement btn_addressBook;
    @FindBy(xpath = "//a[text()='New Address']")
    WebElement btn_newAddress;
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement txt_firstName;
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement txt_lastName;
    @FindBy(xpath = "//input[@id='input-company']")
    WebElement txt_company;
    @FindBy(xpath = "//input[@id='input-address-1']")
    WebElement txt_address1;
    @FindBy(xpath = "//input[@id='input-address-2']")
    WebElement txt_address2;
    @FindBy(xpath = "//input[@id='input-city']")
    WebElement txt_city;
    @FindBy(xpath = "//input[@id='input-postcode']")
    WebElement txt_postcode;
    @FindBy(xpath = "//select[@id='input-country']")
    WebElement drp_country;
    @FindBy(xpath = "//select[@id='input-zone']")
    WebElement drp_state;
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btn_continue;

    //2. Constructer calling from BasePage
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    // 3. Action Methods
    public void clickAddressBookButton() {
        btn_addressBook.click();
    }

    public void clicknewAddressButton() {
        btn_newAddress.click();
    }

    public void setTxt_firstName(String fname) {
        txt_firstName.sendKeys(fname);
    }

    public void setTxt_lastName(String lname) {
        txt_lastName.sendKeys(lname);
    }

    public void setTxt_company(String cp) {
        txt_company.sendKeys(cp);
    }

    public void setTxt_address1(String ad1) {
        txt_address1.sendKeys(ad1);
    }

    public void setTxt_address2(String ad2) {
        txt_address2.sendKeys(ad2);
    }

    public void setTx_city(String city) {
        txt_city.sendKeys(city);
    }

    public void setTxt_postcode(String postcode) {
        txt_postcode.sendKeys(postcode);
    }

    public void setDrp_country(String country) {
        drp_country.sendKeys(country);
    }

    public void setDrp_state(String state) {
        drp_state.sendKeys(state);
    }

    public void clickbtn_continue() {
        btn_continue.click();
    }

}
