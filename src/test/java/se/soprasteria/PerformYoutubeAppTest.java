package se.soprasteria;

import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;
import soprasteria.android.YoutubeAppBasetest;

public class PerformYoutubeAppTest extends YoutubeAppBasetest {

    @Test(timeOut = 18000, dataProvider = "getDriver")
    public void  performAClickYoutube(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
        mainPage.clickForTop();
    }


    /*
    @Test(timeOut = 18000, dataProvider = "getDriver")
    public void TestingElementYoutube(AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), "Login page did not work");
        mainPage.searchingBox();
        }

     */

    @Test(timeOut = 18000, dataProvider = "getDriver")
    public void showElement (AutomationDriver driver){
        Assert.assertTrue(mainPage.isPageLoaded(), " Login page did not work");
        mainPage.elementLibrary();
    }
}
