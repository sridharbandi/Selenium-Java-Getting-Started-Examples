package com.tech.selenium.stepdefinitions;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sridhar Bandi on 18/05/19.
 */
public class GoogleSteps extends FluentCucumberTest implements En {

    @Page
    GoogleSearchPage googleSearchPage;

    @Page
    SearchResultsPage searchResultsPage;

    @Override
    public WebDriver newWebDriver() {
        return DriverFactory.getBrowser();
    }


    public GoogleSteps() {

        Before(this::before);

        Given("^User is on Google search page$", () -> {
            googleSearchPage.openURL();
        });

        When("^User searches for Selenium$", () -> {
            googleSearchPage.searchFor("Selenium");
        });

        Then("^User can see Selenium results$", () -> {
            Assert.assertTrue(searchResultsPage.getLnkSelenium().displayed());
        });

        After(this::after);
    }
}
