package patterns.pageObject.selenium;

import org.openqa.selenium.WebDriver;


public class ProductPage extends MainPageLocators{

    private WebDriver driver;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText(){
        return  driver.findElement(tittleOfProduct).getAttribute("innerText");

    }

}
