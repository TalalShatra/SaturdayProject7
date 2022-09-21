package POM;

import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PurchasePageElements extends BasePOM {

    public PurchasePageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[id='search']")
    private WebElement searchButton;
    @FindBy(css = "img[class='product-image-photo']")
    private WebElement chooseItemPic;
    @FindBy(xpath = "(//div[@class='swatch-option text'])[4]")
    private WebElement chooseSize;
    @FindBy(xpath = "(//div[@class='swatch-option color'])[2]")
    private WebElement chooseColor;
    @FindBy(css = "button[class='action primary tocart']")
    private WebElement addTOCartButton;
    @FindBy(xpath = "//a[@class='action showcart']")
    private WebElement clickShoppingCart;
    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    private WebElement proceedToCheckoutButton;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement nextButton;
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    private WebElement placeOrder;
    @FindBy(xpath = "(//p)[3]")
    private WebElement orderedSuccess;

    public void selectAnyProduct() {
        waitUntilVisibleAndClickableThenSendKeys(searchButton, "coat");
        searchButton.sendKeys(Keys.ENTER);
        waitUntilVisibleAndClickableThenClick(chooseItemPic);
        waitUntilVisibleAndClickableThenClick(chooseSize);
        waitUntilVisibleAndClickableThenClick(chooseColor);
        waitUntilVisibleAndClickableThenClick(addTOCartButton);
    }
    public void completeCheckOutProcess() {
        waitUntilVisibleAndClickableThenClick(clickShoppingCart);
        waitUntilVisibleAndClickableThenClick(proceedToCheckoutButton);
        waitUntilVisibleAndClickableThenClick(nextButton);
        waitUntilVisibleAndClickableThenClick(placeOrder);
    }
    public void validateSuccessfullyPurchasedProduct() {
        waitUntilUrlToBe("https://magento.softwaretestingboard.com/checkout/onepage/success/");
        orderedSuccess.getText();
        String expectedMessage = ("email you an order confirmation");
        String actualMessage = orderedSuccess.getText().toLowerCase();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
