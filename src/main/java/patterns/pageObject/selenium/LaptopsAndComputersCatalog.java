package patterns.pageObject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaptopsAndComputersCatalog extends CatalogLocators{

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public LaptopsAndComputersCatalog(WebDriver driver){

        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public LaptopsListing openLaptopsProductListing(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(laptopsListing)).click();
        return new LaptopsListing(driver);
    }


}

