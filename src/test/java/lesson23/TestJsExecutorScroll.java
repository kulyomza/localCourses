package lesson23;

import initial.WebDriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestJsExecutorScroll extends WebDriverInit {

    @Test
    public void testScrollByJs() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 1000);", "");

        TimeUnit.SECONDS.sleep((5));

    }
}
