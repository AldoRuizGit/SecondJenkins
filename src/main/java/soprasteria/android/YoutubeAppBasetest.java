package soprasteria.android;

import se.soprasteria.automatedtesting.webdriver.api.base.BaseTestCase;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;
import soprasteria.android.android.pagesApp.MainPage;


public class YoutubeAppBasetest extends BaseTestCase {
    protected MainPage mainPage;

    @Override
    protected String getDriverConfigId() { return ("android_emulator"); }

    @Override
    protected String getConfigFile() { return ("youtube.xml"); }

    @Override
    protected void initPages(AutomationDriver automationDriver) {
        mainPage = new MainPage(automationDriver);
    }
}
