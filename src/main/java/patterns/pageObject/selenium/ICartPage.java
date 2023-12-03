package patterns.pageObject.selenium;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.By;


public interface ICartPage {

    By addedProductsToCartIcon = By.xpath("//rz-icon-badge/span");
    By openCartButton = By.xpath
            ("//rz-cart/button[@class='header__button ng-star-inserted header__button--active']");
    By addedProductToCartTitle = By.xpath("//a[@class='cart-product__title']");



    default void checkingCartCounterI(WebDriverWait webDriverWait, String expectedCartCount) {
        String actualCartCounter = webDriverWait.until
                (ExpectedConditions.visibilityOfElementLocated(addedProductsToCartIcon)).getText().trim();
        Assert.assertEquals(actualCartCounter, expectedCartCount);
    }

    default void openCartPopupI(WebDriverWait webDriverWait){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(openCartButton)).click();
    }


    default void checkingAddedProductI(WebDriverWait webDriverWait, String expectedProductTitleInCart){
        String productTitle = webDriverWait.until
                (ExpectedConditions.elementToBeClickable(addedProductToCartTitle)).getText().trim();
        Assert.assertEquals(productTitle, expectedProductTitleInCart);
    }


}
