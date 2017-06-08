package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;

public class RozetkaTest extends BaseTest {

    HomePage page = new HomePage(driver);

    @Test
    public void searchSortMobile(){

        page.visit();
        page.move();

        /*action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#m-main-ul>li:nth-child(2)"))).build().perform();
        action.moveToElement(driver.findElement(By.cssSelector(".f-menu-pop-l>li:nth-child(1)>a[href=\"http://rozetka.com.ua/mobile-phones/c80003/filter/\"]"))).click().build().perform();*/
    }
}
