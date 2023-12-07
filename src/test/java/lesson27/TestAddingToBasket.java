package lesson27;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestAddingToBasket {
    private SoftAssert softAssert = new SoftAssert();

    final String EXPECTED_CART_COUNTER = "1";

    @Test
    public void testAddingToBasket(){
        open("https://rozetka.com.ua/ua/");
        $(byXpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"))
                .click();
        $(byXpath("/rz-widget-list//a[contains(@href, 'notebooks')]"))
                .click();
        $(byXpath("(//app-buy-button[@extclass='goods-tile__buy-button'])[1]"))
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        SelenideElement titleOfFirstProduct = $(byXpath("(//rz-catalog-tile//span[@class='goods-tile__title'])[1]"));
        String textOfTitleOfFirstProduct = titleOfFirstProduct.attr("innerText");

        SelenideElement basketCounter = $(byXpath("//rz-icon-badge/span"));
        String numFromBasketCounter = basketCounter.attr("innerText");
        softAssert.assertEquals(numFromBasketCounter, EXPECTED_CART_COUNTER);
        basketCounter.click();
        String textOfTitleInBasket = $(byXpath("//a[@class='cart-product__title']"))
                .attr("innerText");
        softAssert.assertEquals(textOfTitleInBasket, textOfTitleOfFirstProduct);
        softAssert.assertAll();


    }
}
