package patterns.pageObject.selenium;

import org.openqa.selenium.By;

public class LaptopsListingLocators {

    By addFirstLaptopToCart = By.xpath("(//app-buy-button[@extclass='goods-tile__buy-button'])[1]");
    By laptopsTitleOnListing = By.xpath("//div[@class='goods-tile__content']");
    By firstTitleOnListing = By.xpath("//div[@class='goods-tile__content']/a/span");
}
