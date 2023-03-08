package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookManagementPage_JY extends BasePage {

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement btn_dropDown;

    @FindBy(xpath = "//tbody//tr[@role='row']")
    public List<WebElement> rows;

    Select select = new Select(btn_dropDown);

    public void clickCount(int count) {
        select.selectByVisibleText(String.valueOf(count));
    }

}
