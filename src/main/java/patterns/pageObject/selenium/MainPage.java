package patterns.pageObject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends MainPageLocators implements ICartPage{

    private WebDriver driver;

    private WebDriverWait webDriverWait;


    public MainPage(WebDriver driver){
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.driver = driver;
    }

    public MainPage typeTextInInputSearch(String text){
        driver.findElement(inputSearch).sendKeys(text);
        return this;
    }

    public MainPage clearOfInputSearch(){
        driver.findElement(inputSearch).clear();
        return this;
    }

    public SearchPage clickBtnSearch(){
        driver.findElement(btnSearch).click();
        return new SearchPage(driver);

    }
    public LaptopsAndComputersCatalog selectCategoryFromSidebar(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(computersCategory)).click();
        return new LaptopsAndComputersCatalog(driver);
    }


}
