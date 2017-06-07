package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RozetkaTest {

    static WebDriver driver;
    static Actions action;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.ie.driver", "src\\resources\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void searchSortMobile(){
        driver.get("http://rozetka.com.ua/");

        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#m-main-ul>li:nth-child(2)"))).build().perform();
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"3361\"]/div/div[1]/div/ul/li[1]/a"))).click().build().perform();

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
