package com.tech.selenium.stepdefinitions;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.testng.Assert;

/**
 * Created by Sridhar Bandi on 16/05/19.
 */
public class GoogleSteps implements En {

    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    public GoogleSteps() {

        Before((Scenario scenario) -> {
            DriverFactory.setBrowser();
            googleSearchPage = new GoogleSearchPage();
            searchResultsPage = new SearchResultsPage();
        });

        Given("^User is on Google search page$", () -> {
            googleSearchPage.openURL();
        });

        When("^User searches for Selenium$", () -> {
            googleSearchPage.searchFor("Selenium");
        });

        Then("^User can see Selenium results$", () -> {
            Assert.assertTrue(searchResultsPage.getLnkSelenium().isDisplayed());
        });
    }
}
