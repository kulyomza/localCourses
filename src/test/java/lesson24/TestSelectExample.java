package lesson24;

import initial.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestSelectExample extends WebDriverInit {

    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        select.selectByValue("1");
        sleep(5000);
        select.selectByIndex(2);
        sleep(5000);

    }
}
