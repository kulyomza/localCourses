package lesson24;

import initForWebDriver.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestUploadExample extends WebDriverInit {

    @Test
    public void testUpload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));

        uploadElement.sendKeys("C:\\Users\\user\\IdeaProjects\\Autodoc_course\\src\\test\\java\\homeWorkTests\\hm21");
        uploadBtn.click();

        sleep(5000);
    }
}
