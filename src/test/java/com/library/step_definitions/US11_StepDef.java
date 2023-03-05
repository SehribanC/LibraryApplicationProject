package com.library.step_definitions;

import com.library.pages.Login_Page;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US11_StepDef {

    Login_Page loginPage = new Login_Page();

    @Given("I am on the login page")
    public void i_Am_On_The_Login_Page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));

    }

    @When("I am as user login as {string}")
    public void user_login_as(String user) {
        if (user.equals("student2")){
            loginPage.login_student();
        } else if (user.equals("librarian12")) {
            loginPage.login_librarian(12);
        }else{
            System.out.println("Invalid user");
        }
    }

    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String arg0) {
    }
}
