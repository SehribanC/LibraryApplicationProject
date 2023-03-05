package com.library.step_definitions;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US11_StepDef {

    @Given("I am on the login page")
    public void i_Am_On_The_Login_Page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));

    }

    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String arg0) {
    }
}
