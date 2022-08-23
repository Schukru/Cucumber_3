package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_LoginSteps extends GWD{

    DialogContent dc = new DialogContent();
    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() throws InterruptedException {
//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));

        dc.findAndSend("username", "richfield.edu");
        dc.findAndSend("password","Richfield2020!");
        dc.findAndClick("loginButton");

    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOf(dc.dashboard));
//        Assert.assertTrue(dc.dashboard.getText().contains("Dashboard"));
        dc.findAndContainsText("dashboard","Dashboard");

    }

    @And("Accept All Cookies")
    public void acceptAllCookies() {
        dc.findAndClick("acceptAllCookies");
    }
}
