package se.soprasteria.web;

import se.soprasteria.automatedtesting.webdriver.api.base.BaseTestCase;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;
import se.soprasteria.web.pages.MainPage;

public class WebBasetTest extends BaseTestCase {

    protected MainPage mainPage;

    @Override
    protected String getDriverConfigId() {return "chromedriver";}

    @Override
    protected String getConfigFile() { return "config.xml"; }

    @Override
    protected void initPages(AutomationDriver automationDriver) {
        mainPage = new MainPage(automationDriver);
        mainPage.navigateTo();

    }
}