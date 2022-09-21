package POM;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePOM {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void waitUntilVisibleAndClickableThenClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void waitUntilVisibleAndClickableThenSendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }
    public void selectFunction(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByValue(text);
    }
    public void waitUntilUrlToBe(String text1) {
        wait.until(ExpectedConditions.urlToBe(text1));
    }

    public void waitUntilVisible(WebElement element2) {
        wait.until(ExpectedConditions.visibilityOf(element2));
    }
}
