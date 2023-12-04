package lesson25;

import initForWebDriver.WebDriverInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import patterns.pageObject.selenium.MainPage;

public class FirstPageObjectTest extends WebDriverInit {

    final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";
    final String URL = "https://rozetka.com.ua/";

    @Test
    public void firstTest() {
        driver.get(URL);
        changeCFCookie("bNrPnMyAfR5iTZAczbybP41YBGXCgX7S6BbYuPeM6YY-1701603958-0-1-2a22b3c9.facf2c8d.7d23ec29-0.2.1701603958");
        String actualTitle = new MainPage(driver).typeTextInInputSearch("Mac").
                clickBtnSearch().clickOnFirstProductTitle(0)
                .getTitleText();
        Assert.assertEquals(actualTitle, EXPECTED_TITLE);
    }

}
