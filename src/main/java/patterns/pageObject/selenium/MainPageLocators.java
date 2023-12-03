package patterns.pageObject.selenium;

import org.openqa.selenium.By;

public class MainPageLocators {

    By inputSearch = By.name("search");
    By btnSearch = By.xpath("//button[contains(@class, 'search-form__submit')]");
    By firstProductTitle = By.xpath("//span[@class='goods-tile__title']");
    By tittleOfProduct = By.xpath("//div[@class='product__heading']/h1");
    By computersCategory = By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]/a");




}
