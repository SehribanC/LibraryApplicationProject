package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US90_UserId_Page {

    public US90_UserId_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement btn_users;

    @FindBy(xpath = "//select[@name ='tbl_users_length']")
    public WebElement slct_show;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement inp_search;

    @FindBy(xpath = " //tbody//tr//td[2]")
    public List<WebElement> table_userid;

    @FindBy(xpath = "//div[@class='dataTables_info']")
    public WebElement table_info;

    @FindBy(xpath = "//div[@class='dataTables_paginate paging_bootstrap_full_number']//li[4]")
    public WebElement btn_next;




    public int totalUser() {

        String info = table_info.getText();
        //Showing 1 to 211 of 211 entries
        int index_lastspace = info.lastIndexOf(" ");
        int indexOf = info.indexOf("of");
        String num = info.substring(indexOf + 3, index_lastspace);

        int num1 = Integer.parseInt(num);

        return num1;

    }


}
