package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePage {
    WebDriver driver;
    By qaBtnBy = By.cssSelector("[class='m-top'] a[href$='/faq/']");

    public ContactPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }

    @Override
    public ContactPage open() {
        driver.get("https://rozetka.com.ua/");
        return this;
    }

    public ContactPage clickQa() {
        this.logger.info("click QA");
        wait.until(ExpectedConditions.presenceOfElementLocated(qaBtnBy));
        WebElement qaBtn = driver.findElement(qaBtnBy);
        wait.until(ExpectedConditions.elementToBeClickable(qaBtnBy));
        qaBtn.click();
        return this;
    }
}
