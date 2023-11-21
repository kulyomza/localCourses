package lesson23;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TestJsExecutorClick extends WebDriverInit {

    @Test
    public void testClickByJs() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement searchBtn = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", searchBtn);

        TimeUnit.SECONDS.sleep(5);


    }
}
