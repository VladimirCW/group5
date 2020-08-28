package test.java.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.lesson10.Del;

public class HomePage extends BasePage {
    WebDriver driver;
    By contactBtnBy = By.cssSelector("[class='header-topline__links'] a[href$='/contacts/']");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public HomePage open() {
        this.logger.info("open");
        driver.get("https://rozetka.com.ua/");
        return this;
    }

    public HomePage clickContacts() {
        this.logger.info("click contacts");
        WebElement contactBtn = driver.findElement(contactBtnBy);
        wait.until(ExpectedConditions.elementToBeClickable(contactBtnBy));
        contactBtn.click();
        return this;
    }
}
