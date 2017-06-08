package utils;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class ConciseAPI {

    abstract public WebDriver getWebDriver();
    abstract public Actions getAction();

    public void open(String url){
        getWebDriver().get(url);
    }

    public void step(By firstResult, By secondResult){
        getAction().moveToElement($(firstResult)).build().perform();
        getAction().moveToElement($(secondResult)).click().build().perform();
    }

    public By byCss(String cssSelector){
        return By.cssSelector(cssSelector);
    }

    public By by(String cssSelector){
        return byCss(cssSelector);
    }

    public WebElement $(By locator){
        return assertThat(visibilityOfElementLocated(locator));
    }

    public WebElement $(String cssSelector){
        return $(By.cssSelector(cssSelector));
    }

    public <V> V assertThat(Function<? super WebDriver, V> condition){
        return (new WebDriverWait(getWebDriver(), 5)).until(condition);
    }
}
