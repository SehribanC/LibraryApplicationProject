package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.LibrarianUsersPage;
import com.library.pages.Login_Page;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US92StepDefs {
    Login_Page login_page = new Login_Page();
    LibrarianUsersPage librarianUsersPage= new LibrarianUsersPage();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
    }

    @And("I login as a librarian")
    public void iLoginAsALibrarian() {

        login_page.login_librarian();
    }

    @And("I click on {string} link")
    public void iClickOnLink(String iconName) {
        BasePage.navigate_to_link(iconName);
        BrowserUtils.sleep(2);
    }

    @When("I select Show {int} records")
    public void iSelectShowRecords(int numberOfDisplayedUsers) {

        librarianUsersPage.selectByVisibleText(numberOfDisplayedUsers);
        BrowserUtils.sleep(2);
    }

    @Then("show records value should be {int}")
    public void showRecordsValueShouldBe(int numberOfDisplayedUsers) {

        librarianUsersPage.verifyTheSelectedNumberIsDisplayed(numberOfDisplayedUsers);

    }

    @And("the users table must display {int} records")
    public void theUsersTableMustDisplayRecords(int numberOfDisplayedUsers) {

        librarianUsersPage.numberOfDisplayedRows(numberOfDisplayedUsers);
    }
}
