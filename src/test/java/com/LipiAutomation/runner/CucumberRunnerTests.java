package com.LipiAutomation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/test/resources/VWOLogin.feature"},
        glue = {"com.LipiAutomation.step.definitions"},
        plugin = { "pretty", "html:target/cucumber-reports.html"}
)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
