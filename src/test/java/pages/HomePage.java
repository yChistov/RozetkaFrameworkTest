package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By firstResult = by(".#m-main-ul>li:nth-child(2)");

    By secondResult = by(".f-menu-pop-l>li:nth-child(1)>a[href=\"http://rozetka.com.ua/mobile-phones/c80003/filter/\"]");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void visit(){
        open("http://rozetka.com.ua/");
    }

    public void move(){

    }

    public void searchMore(String text){
        $(By.name("q")).sendKeys(text, Keys.ENTER);
    }

    public void followFirstResult(){
        $(firstResult).findElement(by(".r a")).click();
    }
}
