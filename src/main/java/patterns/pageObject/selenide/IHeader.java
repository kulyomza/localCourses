package patterns.pageObject.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public interface IHeader {

    SelenideElement cartCounter = $(byXpath("//rz-icon-badge/span"));
    SelenideElement cartButton = $(byXpath("//rz-cart/button[@class='header__button ng-star-inserted header__button--active']"));

    default void checkingCartCounterI( String expectedCartCount) {
        String actualCartCounter = cartCounter.shouldBe(Condition.visible).getText().trim();
        Assert.assertEquals(actualCartCounter, expectedCartCount);
    }
    default void openCartPopupI(){
        cartButton.shouldBe(Condition.appear).click();
    }
}
