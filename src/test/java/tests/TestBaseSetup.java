package test.java.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.java.pages.ContactPage;
import test.java.pages.HomePage;
import test.java.pages.QaPage;
import test.java.utils.Screenshot;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBaseSetup {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //FirefoxOptions ffOptions = new FirefoxOptions();
        //driver = new ChromeDriver(options);
        try {
            driver = new RemoteWebDriver(new URL("http://ec2-18-188-168-196.us-east-2.compute.amazonaws.com:4444/wd/hub"), options);
            //driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), options);
            //driver = new RemoteWebDriver(new URL("localhost:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        Screenshot screenshot = new Screenshot(driver);
        screenshot.makeScreenshot(result);
        driver.quit();
    }
}
