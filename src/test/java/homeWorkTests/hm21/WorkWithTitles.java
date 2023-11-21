package homeWorkTests.hm21;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class WorkWithTitles extends WebDriverInit {

    @Test
    public void findElements() throws InterruptedException, IOException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptopsAndCompCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]")));
        laptopsAndCompCategory.click();
        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@href, 'c80004/')])[1]")));
        subCategory.click();


        By titlesOfLaptops = By.xpath("//span[@class='goods-tile__title']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(titlesOfLaptops));
        List<WebElement> listOfTitles = driver.findElements(titlesOfLaptops);


        By priceOfLaptops = By.xpath("//span[@class='goods-tile__price-value']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(priceOfLaptops));
        List<WebElement> listOfPrice = driver.findElements(priceOfLaptops);

        Map<String, String> titleAndPrice = new LinkedHashMap<>();
        for (int i = 0; i < listOfTitles.size(); i++){
            titleAndPrice.put(listOfTitles.get(i).getText(), listOfPrice.get(i).getText());
        }

        FileWriter rozetkaTest = new FileWriter("src/test/java/homeWorkTests/hm21/rozetkaTest.txt");
        for (Map.Entry<String, String> report : titleAndPrice.entrySet()) {
            rozetkaTest.write(report.getKey() + " - " + report.getValue().replace('₴', ' ') + "\n");
        }

        rozetkaTest.close();
    }

}
