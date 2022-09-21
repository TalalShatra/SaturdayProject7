package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPageElements extends BasePOM {


    public MyAccountPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[class='action switch']")
    private WebElement myAccountDropdown;
    @FindBy(xpath = "//a[text()='My Account']")
    private WebElement myAccountButton;

    public void navigateToMyHomePage() {
        waitUntilVisibleAndClickableThenClick(myAccountDropdown);
        waitUntilVisibleAndClickableThenClick(myAccountButton);
    }

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    private WebElement manageAddressButton;

    public void manageAddress() {
        manageAddressButton.click();
    }


    @FindBy(css = "input[id='street_1']")
    private WebElement inputStreetAddress;

    @FindBy(css = "input[id='city']")
    private WebElement inputCity;

    @FindBy(css = "select[id='region_id']")
    private WebElement stateDropdown;

    @FindBy(css = "input[id='zip']")
    private WebElement inputZipCode;

    @FindBy(css = "select[id='country']")
    private WebElement countryDropdown;

    @FindBy(css = "input[id='telephone']")
    private WebElement inputPhoneNumber;

    @FindBy(css = "button[title='Save Address']")
    private WebElement saveButton;

    public void addNewAddress(String phone, String address, String city, String state, String zipCode, String country) {
        inputPhoneNumber.sendKeys("8623529870");
        inputStreetAddress.sendKeys("12 Hillside dr");
        inputCity.sendKeys("soria");
        waitUntilVisibleAndClickableThenClick(stateDropdown);
        selectFunction(stateDropdown,"5");
        inputZipCode.sendKeys("06564");
        waitUntilVisibleAndClickableThenClick(countryDropdown);
        selectFunction(countryDropdown,"DE");
        saveButton.click();
    }

    @FindBy(css = "div[role='alert']")
    private WebElement newAddressSuccessMsg;

    public void addressCreatedSuccessfully() {
        waitUntilUrlToBe("https://magento.softwaretestingboard.com/customer/address/index/");
        waitUntilVisible(newAddressSuccessMsg);
        Assert.assertTrue(newAddressSuccessMsg.isDisplayed());
    }
}
