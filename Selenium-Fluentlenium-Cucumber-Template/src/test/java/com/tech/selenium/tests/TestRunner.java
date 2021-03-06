package com.tech.selenium.tests;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by Sridhar Bandi on 18/05/19.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/Google.feature"},
        glue = {"com.tech.selenium.stepdefinitions"},
        plugin = {"json:target/cucumber-report.json","html:target/cucumber-html"})
public class TestRunner {
}
