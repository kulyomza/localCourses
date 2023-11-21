package lesson23;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAlertExample extends WebDriverInit {

    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("alert('Are you sure?')");

        TimeUnit.SECONDS.sleep(5);

        driver.switchTo().alert().accept();

        TimeUnit.SECONDS.sleep(5);
    }
    //confirm("Press a button!\nEither OK or Cancel.")
    //prompt("Please enter your name", "Harry Potter");

}
