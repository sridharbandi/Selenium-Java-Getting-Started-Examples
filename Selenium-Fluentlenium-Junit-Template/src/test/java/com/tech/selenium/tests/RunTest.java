package com.tech.selenium.tests;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sridhar Bandi on 18/05/19.
 */
public class RunTest extends FluentTest {

    @Page
    GoogleSearchPage googleSearchPage;

    @Page
    SearchResultsPage searchResultsPage;

    @Override
    public WebDriver newWebDriver() {
        return DriverFactory.getBrowser();
    }

    @Test
    public void exampleTest(){
        //Write your test here
        googleSearchPage.openURL();
        googleSearchPage.searchFor("Selenium");
        Assert.assertTrue(searchResultsPage.getLnkSelenium().displayed());
    }

}
