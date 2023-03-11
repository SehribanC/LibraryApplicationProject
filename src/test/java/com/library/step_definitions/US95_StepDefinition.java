package com.library.step_definitions;

import com.library.pages.LibrarianUsersPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US95_StepDefinition {

    LibrarianUsersPage element = new LibrarianUsersPage();





    @When("User login {string} and {string}")
    public void userLoginAnd(String userName, String password) {
        element.inputEmail.sendKeys(userName);
        BrowserUtils.sleep(1);
        element.inputPassword.sendKeys(password);
        BrowserUtils.sleep(1);
        element.buttonSignIn.click();
    }


  /*  @Then("Account holder name should be name")
    public void account_holder_name_should_be_name(List<String> names) {
        for (String eachName : names) {
            Assert.assertEquals(eachName, element.valid_user.getText());

        }

    }

   */


    @Then("Account holder name should be {string}")
    public void accountHolderNameShouldBe(String name) {
        BrowserUtils.sleep(2);
        Assert.assertEquals(name, element.valid_user.getText());
    }
}


