package lesson21;

import initial.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithAttrr extends WebDriverInit {

    final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

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
        WebElement tittleOnProductPage = driver.findElement(By.xpath("//div[@class='product__heading']/h1"));
        String tittleOnProductPageText = titleOfFirstProduct.getAttribute("InnerText");
        Assert.assertEquals(tittleOnProductPageText, EXPECTED_TITLE, "Titles doesn't equals");
    }
}
