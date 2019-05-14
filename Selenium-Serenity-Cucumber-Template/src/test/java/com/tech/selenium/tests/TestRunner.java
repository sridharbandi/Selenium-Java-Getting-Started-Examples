package com.tech.selenium.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Sridhar Bandi on 14/05/19.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"classpath:features/Google.feature"},
        glue = {"com.tech.selenium.stepdefinitions"})
public class TestRunner {
}
