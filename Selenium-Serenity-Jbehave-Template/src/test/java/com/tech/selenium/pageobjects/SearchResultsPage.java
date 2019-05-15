package com.tech.selenium.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sridhar Bandi on 15/05/19.
 */
public class SearchResultsPage extends PageObject {

    private WebDriver _driver = null;

    @FindBy(partialLinkText = "Selenium - Web Browser Automation")
    WebElementFacade lnkSelenium;

    public boolean seleniumResultPresent(){
        return lnkSelenium.isDisplayed();
    }
}
