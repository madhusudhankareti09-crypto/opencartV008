package pageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlingPage {

    WebDriver driver;

    // Constructor
    public WindowHandlingPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By skip_btn = By.xpath("//button[@id='btn2']");
    By drp_switchTo = By.xpath("//a[text()='SwitchTo']");
    By opt_Alert =By.xpath("//a[text()='Alerts']");
    By opt_Windows = By.xpath("//a[text()='Windows']");
    By slt_NewWindow = By.xpath("//a[text()='Open New Tabbed Windows ']");
    By getSlt_NewWindow = By.xpath("//button[text()='    click   ']");
    By chk_title = By.xpath("//title['Selenium logo green']");
    By saprt_new_window = By.xpath("//a[text()='Open New Seperate Windows']");
    By clk_sapr_newWindow = By.xpath("//button[text()='click']");
    By btn_search = By.xpath("//span[text()='Search']");
    By txt_search = By.xpath("//input[@type='search']");

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
        driver.findElement(opt_Windows).click();
    }

    public void openTabNewWindow() {
        //opened parent window
        driver.findElement(slt_NewWindow).click();
        // Store parent window
        String parentTabWindow = driver.getWindowHandle();
        // opened child window
        driver.findElement(getSlt_NewWindow).click();
        Set<String> tabWindowIds = driver.getWindowHandles();
        //stored child window
        String childTabWindow = "";

        for (String tabWinId : tabWindowIds) {

            if (!tabWinId.equals(parentTabWindow)) {

                childTabWindow = tabWinId;


            }
        }

// Switch back to parent window
        driver.switchTo().window(parentTabWindow);
        System.out.println("Back to Parent Window");
        System.out.println(driver.getTitle());
// Switch back to child window
        driver.switchTo().window(childTabWindow);
        System.out.println("Back to Child Window");
        System.out.println(driver.getTitle());
// Switch back to parent window
        driver.switchTo().window(parentTabWindow);
        System.out.println("Back to Parent Window");
        System.out.println(driver.getTitle());
    }


    public void openNewWindow() {
        //opened parent window
        driver.findElement(saprt_new_window).click();
        // Store parent window
        String parentWindow = driver.getWindowHandle();
        //opened child window
        driver.findElement(clk_sapr_newWindow).click();
        Set<String> windowIds = driver.getWindowHandles();
        //stored child window
        String childNewWindow = "";

        for (String newWinId : windowIds) {

            if (!newWinId.equals(parentWindow)) {

                childNewWindow = newWinId;


            }
        }
// Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent Window");
        System.out.println(driver.getTitle());
// Switch back to child window
        driver.switchTo().window(childNewWindow);
        System.out.println("Back to Child Window");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(btn_search).click();
        driver.findElement(txt_search).sendKeys("Selenium WebDriver");
// Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent Window");
        System.out.println(driver.getTitle());
    }


}
