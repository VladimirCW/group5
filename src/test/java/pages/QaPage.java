package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class QaPage extends BasePage {
    WebDriver driver;
    By questionsBy = By.cssSelector("[name='slider-block-active']");

    public QaPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }

    @Override
    public QaPage open() {
        driver.get("https://rozetka.com.ua/");
        return this;
    }

    public List<WebElement> getQuestion() {
        this.logger.info("Get questions");
        (new WebDriverWait(driver, 10)).until(d -> d.findElements(questionsBy).size() > 0);
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(questionsBy).get(0)));
        List<WebElement> questions = driver.findElements(questionsBy);
        System.out.println(questions.size());
        return questions;
    }
}
