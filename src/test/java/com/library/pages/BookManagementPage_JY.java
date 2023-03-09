package com.library.pages;

import com.library.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookManagementPage_JY extends BasePage {

    @FindBy(xpath = "//select[@aria-controls='tbl_users']")
    public WebElement btn_dropDown;

    @FindBy(xpath = "//tbody//tr[@role='row']")
    public List<WebElement> rows;

    public void clickDropDowns(String count){
        btn_dropDown.click();
        Select select = new Select(btn_dropDown);
        select.selectByVisibleText(count);
    }

    public void verifyTableNumSameCountNum(String count){
        int num = Integer.parseInt(count);
        Assert.assertEquals(num,rows.size());
    }



    }

