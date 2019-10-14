package se.soprasteria;

import org.testng.Assert;
import org.testng.annotations.Test;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;
import soprasteria.android.MobileBaseTest;

public class PerformAndroidTest extends MobileBaseTest {

    @Test(timeOut = 180000, dataProvider = "getDriver", groups = {"ANDROID"})
    protected void swipeTest(AutomationDriver driver) {
        mainPage.switchToSwipeScreen();
        mainPage.swipeUp();
        Assert.assertTrue(mainPage.isSwipeUpDisplayed());
        mainPage.swipeDown();
        Assert.assertFalse(mainPage.isSwipeDownDisplayed());
         // Emulator test
    }
}