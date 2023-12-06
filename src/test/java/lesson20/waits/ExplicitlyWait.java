package lesson20.waits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class ExplicitlyWait {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    @BeforeTest
    public void initDriver(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void testWithImplicitlyWait() throws InterruptedException {
        driver.get("https//www.google.com.ua");
        WebElement someElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("someId")));

        WebElement someElement2 = driver.findElement(By.xpath("someElement2"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(someElement2));

        sleep(5000);
    }

}
