package homeWorkTests.hm23;

import initial.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class TestRozetkaPromo extends WebDriverInit {

    final String EXPECTED_LABEL = "АКЦІЯ";


    @Test
    public void testPromotions(){


        driver.get("https://rozetka.com.ua/");
        changeCFCookie("GzMszry4I4_kjBc4hiPXecT.mvMjTvVjjCZ.77oB4UQ-1701020681-0-1-2a22b3c9.f0c85b7d.7d23ec29-0.2.1701020681");
        laptopAndComputersSideMenu();
        laptopCategory();
        applyFilterBySeller();
        applyFilterByPrice();
        saleGood();
        WebElement promoLabel = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[contains(@class, 'promo-label_type_action') and contains(text(), 'АКЦІЯ')])[1]")));
        String promo = promoLabel.getText().trim();
        Assert.assertEquals(promo, EXPECTED_LABEL, "Product without promo label");
        Assert.assertTrue(promoLabel.isDisplayed(), "Promo Label isn't displayed");


    }
    public void laptopAndComputersSideMenu(){
        WebElement laptopsAndCompCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]")));
        laptopsAndCompCategory.click();

    }
    public void laptopCategory(){
        WebElement subCategory = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@href, 'https://rozetka.com.ua/ua/notebooks/c80004/')])[1]")));

        subCategory.click();

    }
    public void applyFilterBySeller(){
        WebElement sellerFilter = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-id='Rozetka']")));
        sellerFilter.click();
        sellerFilter.isSelected();


    }
    public void applyFilterByPrice(){
        WebElement filterPriceInput = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@formcontrolname='max']")));
        filterPriceInput.click();
        filterPriceInput.clear();
        filterPriceInput.sendKeys("100000");
        filterPriceInput.sendKeys(Keys.ENTER);

    }
    public void saleGood(){

        boolean foundPromo = false;
        boolean allProductChecked = false;
        while (!foundPromo && !allProductChecked) {
            List<WebElement> promoLabels = driver.findElements(By.xpath("//div[@class='goods-tile__content']/span"));
            for (int i = 0; i < promoLabels.size(); i++) {
                String typeOfPromo = promoLabels.get(i).getText();
                if (typeOfPromo.equalsIgnoreCase("АКЦІЯ")) {
                    WebElement firstProductWithPromo = promoLabels.get(i).findElement(By.xpath(".."));
                    WebElement linkForProductPage = firstProductWithPromo.findElement(By.xpath("a"));
                    webDriverWait.until(ExpectedConditions.elementToBeClickable(linkForProductPage)).click();
                    foundPromo = true;
                    break;
                }
            }
            if (!foundPromo) {
                WebElement addProductBtn = driver.findElement(By.xpath("//a[@class='show-more show-more--horizontal']"));
                addProductBtn.click();
                allProductChecked = true;
            }
        }


    }

}
