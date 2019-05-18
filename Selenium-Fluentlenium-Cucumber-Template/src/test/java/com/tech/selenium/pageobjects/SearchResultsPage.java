package com.tech.selenium.pageobjects;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sridhar Bandi on 18/05/19.
 */
public class SearchResultsPage extends FluentPage {

    @FindBy(partialLinkText = "Selenium - Web Browser Automation")
    private FluentWebElement lnkSelenium;

    public FluentWebElement getLnkSelenium(){
        await().untilPage().isLoaded();
        return lnkSelenium;
    }
}
