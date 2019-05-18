package com.tech.selenium.pageobjects;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sridhar Bandi on 18/05/19.
 */
public class GoogleSearchPage extends FluentPage {

    @FindBy(name = "q")
    private FluentWebElement searchBox;

    public void openURL(){
       goTo("https://www.google.com/");
    }

    public void searchFor(String searchTerm){
        searchBox.fill().with(searchTerm);
        searchBox.submit();
    }
}
