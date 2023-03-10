package com.library.step_definitions;

import com.library.pages.LibrarianUsersPage;
import com.library.pages.BasePage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class US97StepDefs {

    LibrarianUsersPage elements = new LibrarianUsersPage();



    @Given("I am on the login page here")
    public void i_am_on_the_login_page_here() {
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Login"));
        BrowserUtils.sleep(2);
    }
    @Given("I login using following credentials:")
    public void i_login_using_following_credentials(Map<String, String> credentials) {
        elements.inputEmail.sendKeys(credentials.get("email"));
        BrowserUtils.sleep(1);
        elements.inputPassword.sendKeys(credentials.get("password"));
        BrowserUtils.sleep(1);
        elements.buttonSignIn.click();
        BrowserUtils.sleep(2);
    }
  //  @Given("I click on {string} link now")
   // public void i_click_on_link_now(String userModule) {
    //    elements.usersModule.click();
     //   Assert.assertTrue(elements.headerUserManagement.getText().contains(userModule));
    //}
    @When("I search for {string}")
    public void i_search_for(String userID) {
        elements.inputSearchField.sendKeys(userID);
    }
    @Then("table should contain this data")
    public void table_should_contain_this_data(Map<String, String> tableData) {
        String actualUserID = elements.userID_FirstRow.getText();
        String actualFullName = elements.fullName_FirstRow.getText();
        String actualEmail = elements.email_FirstRow.getText();

        Assert.assertEquals(tableData.get("User ID"), actualUserID);
        Assert.assertEquals(tableData.get("Full Name"), actualFullName);
        Assert.assertEquals(tableData.get("Email"), actualEmail);
    }
}
