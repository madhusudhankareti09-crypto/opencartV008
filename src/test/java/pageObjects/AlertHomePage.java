package pageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

public class AlertHomePage extends BasePage {

    //Locators
    By skip_btn = By.xpath("//button[@id='btn2']");
    By drp_switchTo = By.xpath("//a[text()='SwitchTo']");
    By opt_Alert =By.xpath("//a[text()='Alerts']");
    //By Simple_Alert=By.xpath("//a[text()='Alert with OK ']");

    @FindBy(xpath = "//a[text()='Alert with OK ']")
    WebElement Simple_Alert;
    @FindBy(xpath = "//button[@onclick='alertbox()']")
    WebElement Simple_btn;
    @FindBy(xpath = "//button[text()='Launch confirm']")
    WebElement Confirm_Alert;
    @FindBy(xpath = "//button[text()='Launch prompt']")
    WebElement Prompt_Alert;
    @FindBy(xpath = "//button[text()='Launch modal']")
    WebElement Pro_Alert;

    @FindBy(xpath = "//button[text()='Save changes']")
    WebElement SaveChangesBtn;

    @FindBy(xpath = "//button[text()='Close']")
    WebElement CloseBtn;

    @FindBy(xpath = "//p[contains(text(),'You chose')]")
    WebElement ResultText;

    //Calling Constructor from BasePage
    public AlertHomePage(WebDriver driver) {
        super(driver);

    }

    //Action Methods
    public void skipPage() {
        driver.findElement(skip_btn).click();
//        try {
//
//            TakesScreenshot ts = (TakesScreenshot) driver;
//            File src = ts.getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(src, new File("./Screenshots/skipPage.png"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        driver.findElement(drp_switchTo).click();
        driver.findElement(opt_Alert).click();
    }


    public void clickSimpleAlert() {
        Simple_Alert.click();
        Simple_btn.click();
        // Handling the alert
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am an alert box!");
        alert.accept(); // Accept the alert (click OK)
        System.out.println("Simple Alert Executed Successfully");
    }

    public void clickConfirmAlert_Ok() {
        Confirm_Alert.click();
        // Handling the alert
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Is this correct?");
        alert.accept(); // Accept the alert (click OK)
        System.out.println("Confirm Alert OK button Executed Successfully");
    }

    public void clickConfirmAlert_Cancel() {
        Confirm_Alert.click();
        // Handling the alert
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Is this correct?");
        alert.dismiss(); // Accept the alert (click Cancel)
        System.out.println("Confirm Alert1 Cancel button Executed Successfully");
    }

    public void clickPromptAlert_Ok() {
        Prompt_Alert.click();
        // Handling the alert
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Hello"); //Entered User Input
        prompt.accept();// Accept the alert (click OK)
        System.out.println("Prompt Alert Accept button Executed Successfully");
    }

    public void clickPromptAlert_Cancel() {
        Prompt_Alert.click();
        // Handling the alert
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Hello"); //Entered User Input
        prompt.dismiss();// Cancel the alert (click Cancel)
        System.out.println("Prompt Alert Cancel button Executed Successfully");
    }

}
