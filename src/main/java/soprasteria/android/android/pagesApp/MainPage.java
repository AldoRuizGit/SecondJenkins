package soprasteria.android.android.pagesApp;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;

public class MainPage extends BasePageObject {

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"YouTube\"]")
    protected WebElement HomeElement;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Trending\"]/android.widget.ImageView")
    protected WebElement clickTrend;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Search\"]")
    protected WebElement searchBox;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText")
    protected WebElement keySenda;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Library\"]")
    protected WebElement getAElement;

    public MainPage(AutomationDriver driver) {
        super(driver);
    }
    @Override
    public boolean isPageLoaded() {
        return elementHelper.isElementDisplayedWithinTime(HomeElement, 10000);
    }
    public void clickForTop() {
        elementHelper.clickWithinTime(clickTrend, 200000);

    }
    public void searchingBox(){
        elementHelper.clickWithinTime(searchBox, 2000);
        elementHelper.sendKeysWithControlledSpeed(keySenda, "New Apple Products", 100);
        sleep(60000);
    }
    public void elementLibrary(){
        elementHelper.isElementDisplayedAndRefreshedWithinTime(getAElement, 2000);

    }

}


