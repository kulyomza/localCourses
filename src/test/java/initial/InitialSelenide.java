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
        Configuration.browserSize = "1280x720";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.browserCapabilities = options;
    }

    public void rozetkaCFCookie(String value){

        Cookie cookie = new Cookie
                ("cf_clearance",
                        "dW3k4I6DTfwb0ewLTU1ZdBItthOm.MjY3BZbys7i6l0-1701766750-0-1-6bc3b921.5818d792.3cc2e6c1-0.2.1701766750");
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);
    }

}
