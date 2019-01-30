package com.tech.selenium.tests;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.GoogleSearchPage;
import com.tech.selenium.pageobjects.SearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Sridhar Bandi on 26/01/19.
 */
public class RunTest {

    private WebDriver driver;
    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @BeforeTest
    public void setUp(){
        driver = DriverFactory.getBrowser();
        googleSearchPage = new GoogleSearchPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Test
    public void exampleTest(){
        //Write your test here
        googleSearchPage.openURL();
        googleSearchPage.searchFor("Selenium");
        Assert.assertTrue(searchResultsPage._lnkSelenium.isDisplayed());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
