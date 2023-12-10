package patterns.pageObject.selenide;

import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public interface ICartPopup {
    ElementsCollection titleOfAddedProducts = $$(byXpath("//a[@class='cart-product__title']"));

    default void checkingAddedProductI( int numberOfProduct, String expectedProductTitleInCart){
        String productTitleInCart = titleOfAddedProducts.get(numberOfProduct).getText().trim();
        Assert.assertEquals(productTitleInCart, expectedProductTitleInCart);
    }


}
