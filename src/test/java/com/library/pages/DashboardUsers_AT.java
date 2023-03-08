package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

// page_url = https://library1.cydeo.com/login.html
public class DashboardUsers_AT {

    public DashboardUsers_AT() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement buttonSignIn;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersModule;

    @FindBy(xpath = "//select[@aria-controls='tbl_users']")
    public WebElement recordsCheckbox;

    @FindBy(xpath = "//*[@id='inputEmail']")
    public WebElement inputEmail;

    @FindBy(xpath = "//*[@id='inputPassword']")
    public WebElement inputPassword;
    public  Select checkbox(){
        Select select=new Select(recordsCheckbox);
        return select;
    }
    public List<Integer> recordsOptions(){
        List<Integer> list=new ArrayList<>();
        for (WebElement eachOption : checkbox().getOptions()) {
            list.add(Integer.parseInt(eachOption.getText()));
        }
        return list;
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement inputSearchField;

    @FindBy(xpath = "//h3[text()='User Management']")
    public WebElement headerUserManagement;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr[1]/td[2]")
    public WebElement userID_FirstRow;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr[1]/td[3]")
    public WebElement fullName_FirstRow;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr[1]/td[4]")
    public WebElement email_FirstRow;




    
}