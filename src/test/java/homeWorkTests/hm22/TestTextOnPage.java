package homeWorkTests.hm22;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;


public class TestTextOnPage extends WebDriverInit {


    @Test
    public void testText() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        driver.get("https://rozetka.com.ua/");
        changeCFCookie("ON1VfId3O131Gll9erDD9bSctN.zWnHW2E7MoEpwp8c-1700752633-0-1-2a22b3c9.64fcd3aa.7d23ec29-0.2.1700752633");



        WebElement loginBtn = driver.findElement(
                By.xpath("(//button[contains(@class, 'header__button')])[2]"));
        loginBtn.click();

        WebElement registrationBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class, 'auth-modal__register-link')]")));
        registrationBtn.click();

        WebElement legalTermsBtn = webDriverWait.until((ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@class, 'button button--link')]"))));
        legalTermsBtn.click();

        Set<String> tab = driver.getWindowHandles();
        List<String> listTabs = new ArrayList<>(tab);
        driver.switchTo().window(listTabs.get(1));


       // sleep(30000);

        String titleOfNewTab = driver.getTitle();
        softAssert.assertEquals(titleOfNewTab, "Угода користувача | ROZETKA", "Titles doesn't equal");

        WebElement switchLanguage = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@class, 'lang__link')]")));
        switchLanguage.click();
        WebElement deleteAcc = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='rz-text']/h3[5]")));
        boolean deleteAccInfo = deleteAcc.isDisplayed();
        softAssert.assertTrue(deleteAccInfo, "Text isn't displayed on the page");
        String text = deleteAcc.getText().trim();
        softAssert.assertEquals(text, "Как удалить аккаунт?", "Text doesn't equal");
        softAssert.assertAll();

    }
}
