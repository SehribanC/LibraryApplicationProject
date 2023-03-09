package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserPage {

    public UserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement clickUser;

    @FindBy(xpath = "//input[@class='form-control input-sm input-small input-inline']")
    public WebElement searchBox;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr/td[3]")
    public List<WebElement> actualRows;

    @FindBy(xpath = "//table[@id='tbl_users']/thead/tr/th")
    public List<WebElement> actualColumnNames;

}
