package test.java.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.java.pages.ContactPage;
import test.java.pages.HomePage;
import test.java.pages.QaPage;
import test.java.utils.Screenshot;

import java.util.concurrent.TimeUnit;

public class TestBaseSetup {
    WebDriver driver;

    @BeforeMethod
    public void setUp(ITestContext testContext) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        testContext.setAttribute("driver", driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
