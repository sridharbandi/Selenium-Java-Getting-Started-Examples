package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageobjects.GoogleSearchPage;
import pageobjects.SearchResultsPage;

/**
 * Created by Sridhar Bandi on 05/02/19.
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
