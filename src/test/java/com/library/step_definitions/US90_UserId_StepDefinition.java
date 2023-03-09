package com.library.step_definitions;

import com.library.pages.US90_UserId_Page;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class US90_UserId_StepDefinition {

    US90_UserId_Page userId_page = new US90_UserId_Page();

    @When("user click users button in main menu")
    public void user_click_users_button_in_main_menu() {
        userId_page.btn_users.click();

    }
    @When("change show option as {string}")
    public void change_show_option_as(String number) {
        Select select = new Select(userId_page.slct_show);
        select.selectByValue(number);
        BrowserUtils.sleep(3);
    }

    @Then("user should see all user id is unique")
    public void user_should_see_all_user_id_is_unique() {
        if (userId_page.totalUser()<=500){
            Set<WebElement> users = new HashSet<>();
            for (WebElement each : userId_page.table_userid) {
                users.addAll(Arrays.asList(each));
            }

            int expectedTotalUser = users.size();
            int actualTotalUser = userId_page.totalUser();

            Assert.assertEquals(expectedTotalUser,actualTotalUser);
        }else{
            Set<WebElement> users = new HashSet<>();
            do {

                for (WebElement each : userId_page.table_userid) {
                    users.addAll(Arrays.asList(each));
                }

                userId_page.btn_next.click();
            }while (!(userId_page.btn_next.isEnabled()));

            int expectedTotalUser = users.size();
            int actualTotalUser = userId_page.totalUser();

            Assert.assertEquals(expectedTotalUser,actualTotalUser);

        }




    }


    @And("user search some {string}")
    public void userSearchSome(String keyword) {
        userId_page.inp_search.sendKeys(keyword+ Keys.ENTER);

    }

}
