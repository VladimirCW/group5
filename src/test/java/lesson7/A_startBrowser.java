package test.java.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A_startBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        //options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        //options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);
        //driver.get("https://rozetka.com.ua/");
        driver.get("https://rozetka.com.ua/ua/notebooks/c80004/");
        Thread.sleep(7000);

        By cart = By.id("cart_popup_header");
        By uaLangBtn = By.linkText("ua");
        By uaLangBtn2 = By.cssSelector("[data-lang='ua']");
        By uaLangBtn3 = By.cssSelector("a[href='https://rozetka.com.ua/ua/']");
        By uaLangBtn4 = By.xpath("//a[@href='https://rozetka.com.ua/ua/']");
        By city = By.xpath("//a[@class='header-cities__link link-dashed']");
        WebElement cityEl = driver.findElement(city);
        WebElement sellerEl = driver.findElement(By.xpath("//div[@data-filter-name='seller']/button/span[@class='sidebar-block__toggle-title']"));
        WebElement searchSeller = driver.findElement(By.xpath("(//*[@name='searchline'])[1]"));

        String cityText = cityEl.getText();
        System.out.println("City is: " + cityText);
        System.out.println("Seller color is: " + sellerEl.getCssValue("color"));
        searchSeller.sendKeys("Apple");
        Thread.sleep(5000);
        /*searchSeller.sendKeys(Keys.BACK_SPACE);
        searchSeller.sendKeys(Keys.BACK_SPACE);
        searchSeller.sendKeys(Keys.BACK_SPACE);
        searchSeller.sendKeys(Keys.BACK_SPACE);
        searchSeller.sendKeys(Keys.BACK_SPACE);*/
        /*searchSeller.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        searchSeller.sendKeys(Keys.BACK_SPACE);*/
        /*searchSeller.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_LEFT));
        searchSeller.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_LEFT));
        searchSeller.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_LEFT));
        searchSeller.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_LEFT));
        searchSeller.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_LEFT));
        searchSeller.sendKeys(Keys.DELETE);*/
        //searchSeller.clear();
        //driver.findElement(uaLangBtn2).click();


        Thread.sleep(10000);
        driver.quit();
    }
}
