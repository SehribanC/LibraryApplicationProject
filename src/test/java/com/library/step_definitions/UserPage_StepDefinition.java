package com.library.step_definitions;

import com.library.pages.Login_Page;
import com.library.pages.UserPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserPage_StepDefinition {

    Login_Page loginPage = new Login_Page();
    UserPage searchFunc = new UserPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));
    }
    @Given("User login as a librarian")
    public void user_login_as_a_librarian() {
        loginPage.login_librarian();
    }
    @Given("User click on {string} link")
    public void user_click_on_link(String string) {
        searchFunc.clickUser.click();
    }
    @When("User search for {string}")
    public void user_search_for(String search) {
        searchFunc.searchBox.sendKeys(search);
        BrowserUtils.sleep(3);
    }


    @Then("Table should contain rows with {string}")
    public void table_should_contain_rows_with(String search) {

        List<WebElement> actualRows = searchFunc.actualRows;

        for (WebElement actualRow : actualRows) {

            Assert.assertTrue(actualRow.getText().contains(search));

        }


    }



    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedColumnNames) {


        System.out.println(searchFunc.actualColumnNames.size());

        System.out.println(expectedColumnNames);

        int j=0;

        for (int i = 0; i < expectedColumnNames.size(); i++, j++) {

            Assert.assertEquals(expectedColumnNames.get(i), searchFunc.actualColumnNames.get(j).getText());

        }


    }

}



