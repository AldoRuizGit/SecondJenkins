package se.soprasteria.web.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import se.soprasteria.automatedtesting.webdriver.helpers.driver.AutomationDriver;
import se.soprasteria.web.pages.MainPage;

public class user extends MainPage {

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    protected WebElement homeButton;
    @FindBy (xpath = "//*[@id=\"search_query_top\"]")
    protected WebElement sendWords;
    @FindBy (xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
    protected WebElement getPics;
    @FindBy  (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    protected WebElement newTab;


    public user(AutomationDriver driver) {
        super(driver);
    }
}
