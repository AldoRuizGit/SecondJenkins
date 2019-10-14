package se.soprasteria.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import se.soprasteria.automatedtesting.webdriver.api.base.BasePageObject;
import se.soprasteria.automatedtesting.webdriver.api.base.BaseTestConfig;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;



public class MainPage extends BasePageObject {

    @FindBy (xpath = "//*[@id=\"header_logo\"]/a/img")
    protected WebElement homeButton;
    @FindBy (xpath = "//*[@id=\"search_query_top\"]")
    protected WebElement sendWords;
    @FindBy (xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
    protected WebElement getPics;
    @FindBy  (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    protected WebElement newTab;





    public MainPage(AutomationDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        return elementHelper.isElementDisplayedWithinTime(homeButton, 2000);
    }

    public void navigateTo() {
        driver.navigateTo(BaseTestConfig.getConfigurationOption("url.adminpage"));

    }
    public void sendKeys(){
        elementHelper.sendKeysWithControlledSpeed(sendWords, "Hello", 200);
    }
    public void getPictures(){
        elementHelper.isElementPresentAndDisplayed(getPics);

    }
    public void getTabb(){
        elementHelper.openElementLinkInSameTab(newTab);

    }



}


