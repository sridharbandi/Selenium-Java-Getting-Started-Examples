package com.tech.selenium.pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sridhar Bandi on 17/05/19.
 */
public class GoogleSearchPage {

    private SelenideElement searchBox = $(byName("q"));

    public void openURL(){
       open("https://www.google.com/");
    }

    public void searchFor(String searchTerm){
        searchBox.val(searchTerm).pressEnter();
    }
}
