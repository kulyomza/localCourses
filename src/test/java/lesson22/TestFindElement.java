package lesson22;

import dev.failsafe.internal.util.Assert;
import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;

public class TestFindElement extends WebDriverInit {
    @Test
    public void findElements() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptopsAndCompCategory = driver.findElement(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
        laptopsAndCompCategory.click();
        WebElement subCategory = driver.findElement(
                By.xpath("(//a[contains(@href, 'c80004/')])[1]"));
        subCategory.click();
        sleep(5000);

        List<WebElement> listOfTitles = driver.findElements(
                By.xpath("//span[@class='goods-tile__title']"));
        for (WebElement element: listOfTitles) {
            String titleText = element.getText();
            System.out.println(titleText);
        }

        org.testng.Assert.assertEquals(listOfTitles.size(), 60, "Elements size on page doesn't equals 60");


    }
}
