package com.tech.selenium.stepdefinitions;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

/**
 * Created by Sridhar Bandi on 17/05/19.
 */
public class GoogleSteps extends Steps {

    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @BeforeScenario
    public void setUp() {
        DriverFactory.setBrowser();
        googleSearchPage = new GoogleSearchPage();
        searchResultsPage = new SearchResultsPage();
    }

    @Given("User is on Google search page")
    public void userOnGooglePage() {
        googleSearchPage.openURL();
    }

    ;

    @When("User searches for Selenium")
    public void userSearches() {
        googleSearchPage.searchFor("Selenium");
    }

    @Then("User can see Selenium results")
    public void userSeesResults() {
        Assert.assertTrue(searchResultsPage.getLnkSelenium().isDisplayed());
    }


}
