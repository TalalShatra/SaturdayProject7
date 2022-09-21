package StepDefinition;

import POM.PurchasePageElements;
import io.cucumber.java.en.*;

public class PurchaseStepDefinition {

    PurchasePageElements pp = new PurchasePageElements();

    @Given("Select any Product")
    public void select_any_product() throws InterruptedException {
        Thread.sleep(2000);
        pp.selectAnyProduct();

    }
    @When("Complete checkout process")
    public void complete_checkout_process() throws InterruptedException {
        Thread.sleep(2000);
        pp.completeCheckOutProcess();
    }
    @Then("Validate successfully purchased Product")
    public void validate_successfully_purchased_product() throws InterruptedException {
        Thread.sleep(2000);
        pp.validateSuccessfullyPurchasedProduct();
    }
}
