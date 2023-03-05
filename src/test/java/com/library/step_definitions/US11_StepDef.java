package com.library.step_definitions;

import com.library.pages.Dashboard_Page;
import com.library.pages.Login_Page;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_StepDef {

    Login_Page loginPage = new Login_Page();

    @Given("I am on the login page")
    public void i_Am_On_The_Login_Page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));

    }

    @When("I am as user login as {string}")
    public void user_login_as(String user) {
        if (user.equals("student12")){
            loginPage.login_student(12);
        } else if (user.equals("librarian12")) {
            loginPage.login_librarian(12);
        }else{
            System.out.println("Invalid user");
        }
    }



    @Then("{string} page should be displayed")
    public void page_Should_Be_Displayed(String expectedPage) {
        BrowserUtils.sleep(2);
        String pageUrl= Driver.getDriver().getCurrentUrl();
       // System.out.println("pageUrl = " + pageUrl);

        Assert.assertTrue(pageUrl.contains(expectedPage));
    }
    // ver.2
    Dashboard_Page dashboard_page = new Dashboard_Page();
    Books_Page books_page = new Books_Page();
    @Then("should be displayed {string} page")
    public void should_Be_Displayed_Page(String expectedPage) {
        String actualPage = dashboard_page.dashBoard.getText();
        // System.out.println(actualPage);
        Assert.assertTrue(actualPage.equals(expectedPage));


    }
}
