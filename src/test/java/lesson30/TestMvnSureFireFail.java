package lesson30;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMvnSureFireFail {

    @Test
    @Flaky()
    @Owner("Alex")
    @Lead("Oleg")
    @Description("Short summary")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking unavailability")
    @Feature("Check Out")
    @Story("User should choose Flexible Dates")
    @Issue("WW-1")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void testSurefirePluginFail(){
        Assert.fail("Fail message");
    }
}
