package com.tech.selenium.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

/**
 * Created by Sridhar Bandi on 15/05/19.
 */
@DefaultUrl("https://www.google.com/")
public class GoogleSearchPage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade searchbox;

    public void searchFor(String _searchTerm) {
        searchbox.waitUntilVisible().sendKeys(_searchTerm + Keys.RETURN);
    }

}
