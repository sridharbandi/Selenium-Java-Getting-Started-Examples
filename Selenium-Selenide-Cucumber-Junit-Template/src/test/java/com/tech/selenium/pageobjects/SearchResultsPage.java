package com.tech.selenium.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sridhar Bandi on 16/05/19.
 */
public class SearchResultsPage {

    private SelenideElement lnkSelenium = $(byPartialLinkText("Selenium - Web Browser Automation"));

    public SelenideElement getLnkSelenium(){
        return lnkSelenium.waitUntil(Condition.appear, 60000);
    }
}
