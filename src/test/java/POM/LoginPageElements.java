package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageElements extends BasePOM{

    public LoginPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li//a")
    private WebElement sigInButton;

    @FindBy(xpath = "(//input[@class='input-text'])[2]")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(id = "send2")
    private WebElement sigInButton2;

    @FindBy(xpath = "//span[text()='Welcome, well sander!']")
    private WebElement successMessage;


    public void userNavigateToWebsite(){
        sigInButton.click();
    }

    public void userEnterValidInfo(String username, String password){
        emailInput.sendKeys("wellsa@gmail.com");
        passwordInput.sendKeys("Soso1971");
        sigInButton2.click();
    }
    public void userShouldLoginSuccessfully(){
        Assert.assertTrue(successMessage.isDisplayed());
    }

}
