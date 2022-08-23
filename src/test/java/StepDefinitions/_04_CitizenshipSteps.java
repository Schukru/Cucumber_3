package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipSteps {
    DialogContent dc = new DialogContent();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
    }

    @When("User a Citizenship name as {string} short name as {string}")
    public void userACitizenshipNameAsShortNameAs(String arg0, String arg1) {
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
    }

    @And("Click on close button")
    public void clickOnCloseButton() {
    }

    @When("User Delete The {string}")
    public void userDeleteThe(String searchText) {
        dc.SearchAndDelete(searchText);
    }
}
