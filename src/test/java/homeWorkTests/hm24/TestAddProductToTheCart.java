package homeWorkTests.hm24;

import initial.WebDriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import patterns.pageObject.selenium.LaptopsListing;
import patterns.pageObject.selenium.MainPage;

public class TestAddProductToTheCart extends WebDriverInit {

    final String URL = "https://rozetka.com.ua/ua/";
    final String EXPECTED_CART_COUNTER = "1";
    final String EXPECTED_PRODUCT_TITLE_IN_CART =
            "Ноутбук Lenovo IdeaPad Slim 5 16IAH8 (83BG001ARA) Cloud Grey / 16\" " +
                    "IPS WUXGA / Intel Core i5-12450H / RAM 16 ГБ / SSD 512 ГБ /" +
                    " Підсвічування клавіатури / Зарядка через Type-C";

    @Test
    public void testProductInCart(){
        driver.get(URL);
        changeCFCookie("iaokF07KgnV.NnNI0ycC6tQVpF9_SfhN.aSRUml.SxQ-1701679423-0-1-6bc3b921.7d7663c2.3cc2e6c1-0.2.1701679423");

    String firstProductTitleFromLaptopsListing = new MainPage(driver).selectCategoryFromSidebar()
            .openLaptopsProductListing()
            .getTitleTextLaptopsListing();
    new LaptopsListing(driver).addFirstProductToCart(0).checkingCartCounter(EXPECTED_CART_COUNTER)
            .openCartPopup().checkingAddedProduct(EXPECTED_PRODUCT_TITLE_IN_CART);

        Assert.assertEquals( firstProductTitleFromLaptopsListing, EXPECTED_PRODUCT_TITLE_IN_CART, "Titles doesn't equal");
    }
}
