package com.tech.selenium.steps;

import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Sridhar Bandi on 14/05/19.
 */
public class SearchSteps extends ScenarioSteps {

    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @Step
    public void openURL(){
        googleSearchPage.open();
    }

    @Step
    public void searchFor(String searchterm){
        googleSearchPage.searchFor(searchterm);
    }

    @Step
    public boolean seleniumLinkPresent(){
        return searchResultsPage.seleniumResultPresent();
    }
}
