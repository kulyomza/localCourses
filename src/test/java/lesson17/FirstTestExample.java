package lesson17;

import org.testng.annotations.*;

public class FirstTestExample {

    @BeforeTest
    public void beforeTest() {
        System.out.println("this method will execute before first test once");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this method will execute before class once");
    }

    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("this method will execute before each test method");
    }

    @Test(description = "this our first test", priority = 1, timeOut = 5, invocationCount = 5, invocationTimeOut = 20)
    //enabled = false - turnoff test
    public void testMethod() {
        System.out.println("Hello world");
    }

    @Test(expectedExceptions = {ArithmeticException.class})
    public void testDivision() {
        System.out.println(2 / 0);
    }

    @Test(alwaysRun = true, dependsOnMethods = "testMethod", priority = 2, dependsOnGroups = "someGroup")
    public void testMethod2() {
        System.out.println("Hello world");
    }

    @AfterTest
    public void after() {
        System.out.println("this method will execute after each test method");
    }
}
