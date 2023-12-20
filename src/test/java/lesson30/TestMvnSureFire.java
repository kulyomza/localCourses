package lesson30;


import io.qameta.allure.*;
import org.testng.annotations.Test;

public class TestMvnSureFire {


    @Test
    @Flaky()
    @Owner("Alex")
    @Lead("Oleg")
    @Description("Test check something")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking availability")
    @Feature("Check In")
    @Story("User should choose Flexible Dates")
    @Issue("qc-22")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void testSurefirePlugin(){
        System.out.println("Message for test");
        Allure.addAttachment("Additional report", "Inside text");
    }

}
