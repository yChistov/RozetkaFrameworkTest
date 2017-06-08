package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.ConciseAPI;

public class BasePage extends ConciseAPI {

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }

    @Override
    public Actions getAction() {
        return action;
    }

    public BasePage(WebDriver driver){
        this.driver = driver;
        action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;
    private Actions action;
}


