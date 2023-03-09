package com.library.step_definitions;

import com.library.pages.LibrarianUsersPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US91StepDefs {
    LibrarianUsersPage elements=new LibrarianUsersPage();
    @Given("As a user go to {string} login page.")
    public void asAUserGoToLoginPage(String loginPage) {
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
        Assert.assertTrue(Driver.getDriver().getTitle().contains(loginPage));
        BrowserUtils.sleep(2);
    }

    @And("Use librarian valid inputs for {string} and {string}")
    public void useLibrarianValidInputsForAnd(String username, String password) {
        elements.inputEmail.sendKeys(username);
        BrowserUtils.sleep(1);
        elements.inputPassword.sendKeys(password);
        BrowserUtils.sleep(1);
        elements.buttonSignIn.click();
        BrowserUtils.sleep(2);
    }


    @When("Librarian on dashboard, click {string} module on top of the page")
    public void librarianOnDashboardClickModuleOnTopOfThePage(String usersModule) {
        Assert.assertTrue(elements.usersModule.getText().contains(usersModule));
        BrowserUtils.sleep(2);
        elements.usersModule.click();

    }

    @Then("Verify librarian see records and  by default should be {int}")
    public void verifyLibrarianSeeRecordsAndByDefaultShouldBe(int records) {
        BrowserUtils.sleep(1);
        Assert.assertEquals(records,Integer.parseInt(elements.checkbox().getFirstSelectedOption().getText()));
        BrowserUtils.sleep(1);
       // System.out.println(select.getFirstSelectedOption().getText());
    }

    @When("Click records checkbox to see different options")
    public void clickRecordsCheckboxToSeeDifferentOptions() {
        BrowserUtils.sleep(2);
        elements.recordsCheckbox.click();
        BrowserUtils.sleep(2);
    }

    @Then("Verify user has different options")
    public void verifyUserHasDifferentOptions(List<Integer>records) {
       Assert.assertEquals(records,elements.recordsOptions());

    }
}
