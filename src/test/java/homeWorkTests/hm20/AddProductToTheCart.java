package homeWorkTests.hm20;

import initial.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddProductToTheCart extends WebDriverInit {

    @Test
    public void theCart() {

        SoftAssert softAssert = new SoftAssert();

        driver.get("https://rozetka.com.ua/");
        WebElement closePopupMainPage = driver.findElement(By.xpath("//span[@class='exponea-close-cross']"));
        closePopupMainPage.click();
        WebElement openComputersCategory = driver.findElement(
                By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"));
        openComputersCategory.click();
        WebElement openLaptopsCategory = driver.findElement(
                By.xpath("//rz-widget-list//a[contains(@href, 'notebooks')]"));
        openLaptopsCategory.click();
        WebElement titleOfTheFirstProduct = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//rz-catalog-tile//span[@class='goods-tile__title'])[1]")));
        String titleOfTheFirstProductText = titleOfTheFirstProduct.getText();

        WebElement buyFirstProductOnThePage = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//app-buy-button[@extclass='goods-tile__buy-button'])[1]")));
        buyFirstProductOnThePage.click();
        WebElement cartCounter = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//rz-icon-badge/span")));
        String cartCounterAmount = cartCounter.getText();
        softAssert.assertEquals(cartCounterAmount, "1", "Amount of products doesn't equal");

        WebElement cartButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//rz-cart/button[@class='header__button ng-star-inserted header__button--active']")));
        cartButton.click();
        WebElement titleOfProductInCart = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@class='cart-product__title']")));
        String titleOfProductInCartText = titleOfProductInCart.getText();
        softAssert.assertEquals(titleOfProductInCartText, titleOfTheFirstProductText, "Titles doesn't equals");
        softAssert.assertAll();

    }
}


