package patterns.pageObject.selenide;

import com.codeborne.selenide.ElementsCollection;


import static com.codeborne.selenide.Selectors.byXpath;

import static com.codeborne.selenide.Selenide.$$;

public class LaptopCategoryPageLocators {
    ElementsCollection tittleOfAllProducts = $$(byXpath("//span[@class='goods-tile__title']"));
    ElementsCollection buyLaptopsProducts = $$(byXpath("//app-buy-button[@extclass]"));

}
