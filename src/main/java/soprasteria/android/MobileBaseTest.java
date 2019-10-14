package soprasteria.android;

import se.soprasteria.automatedtesting.webdriver.api.base.BaseTestCase;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;
import soprasteria.android.android.pagesMobile.MainPage;

public class MobileBaseTest extends BaseTestCase {
    protected MainPage mainPage;

    @Override
    protected String getDriverConfigId() { return ("android") ; }
    @Override
    protected String getConfigFile() { return ("config.xml"); }
    @Override
    protected void initPages(AutomationDriver automationDriver) { }

    @Override
    protected void initializeDriver(AutomationDriver driver) {
        if (driver.isAndroid()) {
            mainPage = new MainPage(driver);
            if(!mainPage.isPageLoaded()) throw new RuntimeException("Page not loaded");
        }
    }
}
