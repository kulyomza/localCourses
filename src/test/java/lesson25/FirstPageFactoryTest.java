package lesson25;

import initial.WebDriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import patterns.pageObject.selenium.MainPage;

public class FirstPageFactoryTest extends WebDriverInit {

    final String EXPECTED_TITTLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";
    final String URL = "https://rozetka.com.ua/";


    @Test
    public void firstTest() {
        driver.get(URL);
        String actualTittle = new MainPage(driver).typeTextInInputSearch("Mac").clickBtnSearch()
                .clickOnFirstProductTitle(0).getTitleText();
        Assert.assertEquals(actualTittle, EXPECTED_TITTLE);
    }

}
