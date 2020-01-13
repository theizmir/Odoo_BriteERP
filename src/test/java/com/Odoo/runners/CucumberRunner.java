package com.Odoo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//this is Cucumber class
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="com/Odoo/step_definitions",
        dryRun = false,
        tags="@CRM"


)
public class CucumberRunner {

}