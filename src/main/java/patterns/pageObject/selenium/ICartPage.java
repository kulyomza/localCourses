package patterns.pageObject.selenium;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface ICartPage {

    default void checkingCartI(WebDriver driver) {
        String actualText = driver.findElement(By.xpath("")).getAttribute("innerText");
        Assert.assertEquals(actualText, "ExpectedText");

    }
}
