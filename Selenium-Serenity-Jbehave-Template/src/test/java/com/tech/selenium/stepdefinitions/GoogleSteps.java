package com.tech.selenium.stepdefinitions;

import com.tech.selenium.steps.SearchSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sridhar Bandi on 15/05/19.
 */
public class GoogleSteps {

    @Managed
    WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Given("User is on Google search page")
    public void onGooglePage() {
        searchSteps.openURL();
    }

    @When("User searches for Selenium")
    public void searchFor() {
        searchSteps.searchFor("Selenium");
    }

    @Then("User can see Selenium results")
    public void results() {
        Assert.assertTrue(searchSteps.seleniumLinkPresent());
    }
}

