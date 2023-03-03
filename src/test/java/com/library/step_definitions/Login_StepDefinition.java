package com.library.step_definitions;

import com.library.pages.Login_Page;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {

        Login_Page loginPage = new Login_Page();

    @Given("user is in login page")
    public void user_is_in_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));
    }
    @When("user login as {string}")
    public void user_login_as(String user) {
       if (user.equals("student")){
          loginPage.login_student();
       } else if (user.equals("librarian")) {
           loginPage.login_librarian();
       }else{
           System.out.println("Invalid user");
       }
    }
    @Then("user should see the title is {string}")
    public void user_should_see_the_title_is(String expectedTitle) {
        BrowserUtils.sleep(2);
       String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
