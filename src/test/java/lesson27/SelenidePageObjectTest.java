package lesson27;

import initial.InitialSelenide;
import org.testng.annotations.Test;
import patterns.pageObject.selenide.MainPageLogic;

public class SelenidePageObjectTest extends InitialSelenide {
    @Test
    public void testSelenidePO() {
        new MainPageLogic().checkCategoriesQuantity(16).clickOnCategory(0)
                .clickOnSubCategoryLaptops()
                .checkQuantityOfGoodsTittles(60);
    }
}
