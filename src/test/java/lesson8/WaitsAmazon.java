package test.java.lesson8;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class WaitsAmazon {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 10, 500);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        //driver.findElement(By.id("icp-nav-flyout")).click();
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(By.id("icp-nav-flyout")))
                .build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[contains(text(), 'Change country/region.')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[descendant::select[@id='icp-selected-country']]")).click();
        Thread.sleep(1000);
        driver
                .findElement(By.xpath("//li[@class='a-dropdown-item' and descendant::span[contains(text(), 'United Kingdom')]]"))
                .click();
        driver.findElement(By.xpath("//span[@data-action = 'nav-country-select-save']")).click();
        class EC implements ExpectedCondition {
            public boolean apply() {
                return true;
            }

            @Override
            public Boolean apply(Object o) {
                return ((WebDriver)o).getWindowHandles().size() > 1;
            }

            public Boolean apply2(Object o) {
                return false;
            }
        }
        EC ec = new EC();

        wait.until(ec);
        /*wait.until(new ExpectedCondition<Boolean>() {
            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return driver.getWindowHandles().size() > 1;
            }
        });*/
        //Thread.sleep(5000);
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "4");
        actions = new Actions(driver);
        actions
                .sendKeys(Keys.chord(Keys.CONTROL, Keys.TAB))
                .perform();
        System.out.println("dfs");

    }
}
