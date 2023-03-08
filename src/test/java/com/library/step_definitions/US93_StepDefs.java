package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.BookManagementPage_JY;
import com.library.pages.Login_Page;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US93_StepDefs {

    Login_Page page = new Login_Page();
    BookManagementPage_JY jy = new BookManagementPage_JY();


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));
    }
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        page.login_librarian();
    }
    @Given("I click on {string} link")
    public void i_click_on_link(String pageName) {
    BasePage.navigate_to_link(pageName);
    }
    @When("I select Show {int} records")
    public void i_select_show_records(Integer count) {
    jy.clickCount(count);
    }
    @Then("show records value should be {int}")
    public void show_records_value_should_be(Integer count) {
        Assert.assertEquals(jy.btn_dropDown.getText(), count.toString());
    }
    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(Integer count) {
        Assert.assertEquals(jy.rows.size(), (int) count);
    }

}
