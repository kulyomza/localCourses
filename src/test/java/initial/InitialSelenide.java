package initial;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class InitialSelenide {
    @BeforeTest
    public void before(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-agent=some user agent");
        options.addArguments("--disable-notifications");
        Configuration.browserSize = "1280x820";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.browserCapabilities = options;
    }

    public void rozetkaCFCookie(String value){

        Cookie cookie = new Cookie
                ("cf_clearance",
                        "qMVG4EbmTavyakgf469R7wP.QJswWp1.pHAUShex1J8-1702129305-0-1-7a105317.4ee41f07.2d110cf7-0.2.1702129305");
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
    }

}
