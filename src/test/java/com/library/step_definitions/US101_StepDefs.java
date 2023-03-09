package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.LibrarianUsersPage;
import com.library.pages.Login_Page;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US101_StepDefs extends BasePage {
   LibrarianUsersPage librarianUsersPage = new LibrarianUsersPage();

    @When("I click on Users module")
    public void iClickOnUsersModule() {
        navigate_to_link("Users");
    }

    @Then("Users page should be displayed")
    public void usersPageShouldBeDisplayed() {
     Assert.assertTrue(librarianUsersPage.userManagementH3.isDisplayed());
    }

    @When("I click on Books module")
    public void iClickOnBooksModule() {
     navigate_to_link("Books");
     BrowserUtils.sleep(1);
     WebElement bookManagementTitle = Driver.getDriver().findElement(By.xpath("//h3"));
     BrowserUtils.sleep(1);
     Assert.assertTrue(bookManagementTitle.isDisplayed());
    }

    @Then("Books page should be displayed")
    public void booksPageShouldBeDisplayed() {
     WebElement bookManagementTitle = Driver.getDriver().findElement(By.xpath("//h3"));
     BrowserUtils.sleep(1);
     Assert.assertTrue(bookManagementTitle.isDisplayed());
    }

    @When("I click on Dashboard link")
    public void iClickOnDashboardLink() {
     navigate_to_link("Dashboard");
    }

    @Then("Dashboard page should be displayed")
    public void dashboardPageShouldBeDisplayed() {
     Assert.assertTrue(threeIcons.isDisplayed());
    }
}
