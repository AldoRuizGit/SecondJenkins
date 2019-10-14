package se.soprasteria;

import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;
import se.soprasteria.web.WebBasetTest;


public class PerformWebTest extends WebBasetTest {

    @Test(timeOut = 18000, dataProvider = "getDriver")
    public void  performAtest(AutomationDriver driver){
        initPages(driver);
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
    }


    @Test(timeOut = 18000, dataProvider = "getDriver")
    public void sendSomething(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
        mainPage.sendKeys();
    }
    @Test (timeOut = 18000, dataProvider = "getDriver")
    public void getElements(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
        mainPage.getPictures();
    }
    @Test (timeOut = 18000, dataProvider = "getDriver")
    public void getTab(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
        mainPage.getTabb();
    }






}
