package StepDefinition;

import POM.LoginPageElements;
import io.cucumber.java.en.*;

public class LoginStepDefinition {
    LoginPageElements lp= new LoginPageElements();

    @Given("User navigate to website")
    public void user_navigate_to_website() {
        lp.userNavigateToWebsite();
    }

    @When("User enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {

        lp.userEnterValidInfo(username,password);
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        lp.userShouldLoginSuccessfully();
    }
}
