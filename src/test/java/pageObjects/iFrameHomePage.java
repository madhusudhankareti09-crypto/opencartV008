package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static javax.swing.UIManager.get;

public class iFrameHomePage extends BasePage {


    //Locators
    @FindBy(xpath = "//button[@id='btn2']")
    WebElement Signinskip_btn;
    @FindBy(xpath = "//a[text()='SwitchTo']")
    WebElement drp_switchTo;
    @FindBy(xpath = "//a[text()='Frames']")
    WebElement sel_frames_Option;
    @FindBy(xpath = "//a[text()='Single Iframe ']")
    WebElement singleframe_btn;
    @FindBy(xpath = "//iframe[@id='singleframe']")
    WebElement singl_iframe;
    @FindBy(xpath = "//a[text()='Iframe with in an Iframe']")
    WebElement NestediFrames_btn;
    @FindBy(xpath = "//iframe[@src='MultipleFrames.html']")
    WebElement parent_iframe;
    @FindBy(xpath = "//div[@class='iframe-container']/child::iframe")
    WebElement child_iFrame;
    @FindBy(xpath = "//h5[normalize-space()='iFrame Demo']")
    WebElement txt_Ifrdemo;
    @FindBy(xpath = "//input[@type='text']")
    WebElement txt_box;


    //Calling Constructor from BasePage
    public iFrameHomePage(WebDriver driver) {
        super(driver);
    }

    //Action Methods
    public void clickSkipSignbtn() {
        Signinskip_btn.click();
        drp_switchTo.click();
        sel_frames_Option.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", singleframe_btn);

    }

    public void clicksingleframe() {
        singleframe_btn.click();
        //Using Normal Switch().frame(); method
        //driver.switchTo().frame(singl_iframe);

        //Using ExplicitWait for iFrame handling

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(singl_iframe));
        txt_Ifrdemo.isDisplayed();
        Assert.assertEquals(txt_Ifrdemo.getText(), "iFrame Demo");
    }

    public void clickNestedframe() {
        NestediFrames_btn.click();
        //Using Normal Switch().frame(); method
        //driver.switchTo().frame(parent_iframe);
        //driver.switchTo().frame(child_iFrame);

        //Using ExplicitWait for iFrame handling
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(parent_iframe));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(child_iFrame));

        txt_Ifrdemo.isDisplayed();
        Assert.assertEquals(txt_Ifrdemo.getText(), "iFrame Demo");
    }

    public void entertext() {
        txt_box.sendKeys("Hello");
        driver.switchTo().defaultContent();
    }

}
