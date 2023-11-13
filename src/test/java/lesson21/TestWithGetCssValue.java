package lesson21;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithGetCssValue extends WebDriverInit {
    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement searchBtn = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        searchBtn.click();
        WebElement titleOfFirstProduct = driver.findElement(
                By.xpath("//span[@class='goods-tile__title'][1]"));
        titleOfFirstProduct.click();
        WebElement inStockLabel = driver.findElement(
                By.xpath("//p[contains(@class, 'status-label--green')]"));
        String colorOfStockLabel = inStockLabel.getCssValue("color");
        Assert.assertEquals(colorOfStockLabel, EXPECTED_LABEL_COLOR, "Color doesn't equals");


    }
}
