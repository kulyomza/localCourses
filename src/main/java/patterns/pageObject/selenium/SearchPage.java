package patterns.pageObject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends MainPageLocators{


    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickOnFirstProductTitle(int titleIndex){
        List<WebElement> titles = driver.findElements(firstProductTitle);
        titles.get(titleIndex).click();
        return new ProductPage(driver);

    }
}
