package com.tech.selenium.stepdefinitions;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


/**
 * Created by Sridhar Bandi on 12/02/19.
 */
public class GoogleSteps extends Steps {

    private WebDriver driver;
    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @BeforeScenario
    public void setUp() {
        driver = DriverFactory.getBrowser();
        googleSearchPage = new GoogleSearchPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
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
        Assert.assertTrue(searchResultsPage._lnkSelenium.isDisplayed());
    }

    @AfterScenario
    public void tearDown() {
        driver.quit();
    }

}
