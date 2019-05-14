package com.tech.selenium.stepdefinitions;

import com.tech.selenium.steps.SearchSteps;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sridhar Bandi on 28/01/19.
 */
public class GoogleSteps {

    @Managed
    WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Given("^User is on Google search page$")
    public void onGooglePage() {
        searchSteps.openURL();
    }

    @When("^User searches for Selenium$")
    public void searchFor() {
        searchSteps.searchFor("Selenium");
    }

    @Then("^User can see Selenium results$")
    public void results() {
        Assert.assertTrue(searchSteps.seleniumLinkPresent());
    }
}

