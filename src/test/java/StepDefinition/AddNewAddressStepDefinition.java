package StepDefinition;


import POM.LoginPageElements;
import POM.MyAccountPageElements;
import io.cucumber.java.en.*;

public class AddNewAddressStepDefinition {

    MyAccountPageElements addAddress = new MyAccountPageElements();

    @Given("Navigate to My Account page")
    public void navigate_to_my_account_page() {
        addAddress.navigateToMyHomePage();
    }

    @Given("Click on Manage Addresses")
    public void click_on_manage_addresses() {
        addAddress.manageAddress();
    }

    @When("Add new address with {string},{string},{string},{string},{string},{string}")
    public void add_new_address_with(String phone, String address, String city, String state, String zipCode, String country) {
        addAddress.addNewAddress(phone, address, city, state, zipCode, country);
    }

    @Then("Validate Address created successfully")
    public void validate_address_created_successfully() {
        addAddress.addressCreatedSuccessfully();
    }
}

