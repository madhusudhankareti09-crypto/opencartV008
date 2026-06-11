package testBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BaseClass2 {
    public static WebDriver driver;
    public Logger logger;//Log4j
    public Properties p;

    @BeforeMethod
    //@Parameters({"os", "browser"})//CrossBrowsing
    public void setup()  {
        logger = LogManager.getLogger(this.getClass());
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get(p.getProperty("AlertURL"));
        driver.get(p.getProperty("iFrameURL"));
        //driver.get(p.getProperty("appURL"));
    }


    @AfterMethod
    public void teardown() {

        driver.quit();
    }
}
