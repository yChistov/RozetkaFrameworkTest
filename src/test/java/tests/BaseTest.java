package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import utils.ConciseAPI;

import java.util.concurrent.TimeUnit;

public class BaseTest extends ConciseAPI {

    protected static WebDriver driver;
    protected static Actions action;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.ie.driver", "src\\resources\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public Actions getAction(){
        action = new Actions(driver);
        return action;
    }
}
