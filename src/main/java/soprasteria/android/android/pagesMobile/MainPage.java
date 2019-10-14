package soprasteria.android.android.pagesMobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.api.datastructures.Speed;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class MainPage extends BasePageObject {

    @FindBy(id = "resetButton")
    WebElement buttonResetAllElements;
    @FindBy(id = "switchToSwipe")
    WebElement buttonSwitchToSwipeScreen;
    @FindBy(id = "swipeUp")
    WebElement textSwipedUp;
    @FindBy(id = "swipeDown")
    WebElement textSwipedDown;

    public MainPage(AutomationDriver driver) { super(driver); }

    @Override
    public boolean isPageLoaded() {
        return elementHelper.isElementDisplayedWithinTime(buttonResetAllElements, 60000)&&
        elementHelper.isElementGoneWithinTime(textSwipedUp, 1000) &&
                elementHelper.isElementGoneWithinTime(textSwipedDown, 1000);
    }
    public void switchToSwipeScreen() {
        elementHelper.clickWithinTime(buttonSwitchToSwipeScreen, 2000);
    }

    public boolean isSwipeUpDisplayed() { return elementHelper.isElementDisplayedWithinTime(textSwipedUp, 0); }

    public boolean isSwipeDownDisplayed() { return elementHelper.isElementDisplayedWithinTime(textSwipedDown, 0); }

    public void swipeUp() { driver.swipeUp(50, 30, Speed.VERY_FAST);logger.info("Successfully swiped up"); }

    public void swipeDown() { driver.swipeDown(50, 30, Speed.VERY_FAST);logger.info("Successfully swiped down"); }

}

