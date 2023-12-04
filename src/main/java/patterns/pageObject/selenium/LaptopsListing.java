package patterns.pageObject.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LaptopsListing extends LaptopsListingLocators implements ICartPage{

    private WebDriver driver;
    private WebDriverWait webDriverWait;


    public LaptopsListing(WebDriver driver){

        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public ProductPage titleOfLaptops(int titleIndex){
        List<WebElement> titles = driver.findElements(laptopsTitleOnListing);
        titles.get(titleIndex).click();
        return new ProductPage(driver);

    }
    public String getTitleTextLaptopsListing(){
        return  driver.findElement(firstTitleOnListing).getText().trim();

    }

    public LaptopsListing addFirstProductToCart(int titleIndex){
        List<WebElement> addProduct = driver.findElements(addFirstLaptopToCart);
        addProduct.get(titleIndex).click();
        return new LaptopsListing(driver);
    }

    public LaptopsListing checkingAddedProduct(String expectedProductTitleInCart){
        checkingAddedProductI(webDriverWait, expectedProductTitleInCart);
        return this;
    }
    public LaptopsListing checkingCartCounter(String expectedCartCount){
        checkingCartCounterI(webDriverWait, expectedCartCount);
        return this;
    }
    public  LaptopsListing openCartPopup(){
        openCartPopupI(webDriverWait);
        return this;
    }




}
