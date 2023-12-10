package homeWorkTests.hm25;

import initial.InitialSelenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import patterns.pageObject.selenide.LaptopCategoryPageLogic;
import patterns.pageObject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class SelenidePageObjectHomeWork extends InitialSelenide {

    final String URL = "https://rozetka.com.ua/ua/";
    final String EXPECTED_CART_COUNTER = "1";

    @Test
    public void testAddProductToCartAndQuantity(){
        open(URL);
        rozetkaCFCookie("qMVG4EbmTavyakgf469R7wP.QJswWp1.pHAUShex1J8-1702129305-0-1-7a105317.4ee41f07.2d110cf7-0.2.1702129305");
        String firstTitleOfProductOnListing = new MainPageLogic().clickOnCategory(0)
                .clickOnSubCategoryLaptops().productTitleFromList(0);
        String addedProductToBasket = new LaptopCategoryPageLogic().addProductToBasket(0).checkingCartCounter(EXPECTED_CART_COUNTER).openCartPopup()
                .checkingAddedProduct(0);
        Assert.assertEquals( firstTitleOfProductOnListing, addedProductToBasket, "Titles doesn't equal");

    }
}
