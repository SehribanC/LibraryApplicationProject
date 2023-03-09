package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.BookManagementPage_JY;
import com.library.pages.Login_Page;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US93_StepDefs {

    Login_Page page = new Login_Page();
    BookManagementPage_JY jy = new BookManagementPage_JY();


    @Given("I am on the login page now")
    public void i_am_on_the_login_page_now() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));
    }
    @Given("I login as a librarian now")
    public void i_login_as_a_librarian() {
        page.login_librarian();
    }
    @Given("I click on {string} link now")
    public void i_click_on_link(String pageName) {
    BasePage.navigate_to_link(pageName);
    }

    @When("I select Show {string} records")
    public void i_select_show_records(String count) {
        BrowserUtils.sleep(3);
        jy.clickDropDowns(count);
    }

    @Then("show records value should be {string}")
    public void show_records_value_should_be(String count) {
        Select select = new Select(jy.btn_dropDown);
        BrowserUtils.sleep(3);
       Assert.assertEquals(select.getFirstSelectedOption().getText(),count);
    }

    @Then("the users table must display {string} records")
    public void the_users_table_must_display_records(String count) {
        jy.verifyTableNumSameCountNum(count);
    }

}
