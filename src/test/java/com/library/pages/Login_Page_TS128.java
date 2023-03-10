package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_Page_TS128 {
    public Login_Page_TS128() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id= 'inputEmail']")
    public WebElement inp_username;

    @FindBy(xpath = "//input[@id= 'inputPassword']")
    public WebElement inp_password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement btn_signIn;


    public void login_librarian(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(inp_username));
        inp_username.sendKeys(ConfigurationReader.getProperty("librarian12_username"));
        inp_password.sendKeys(ConfigurationReader.getProperty("librarian12_password"));
        btn_signIn.click();
    }

    public void login_student(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(inp_username));
        inp_username.sendKeys(ConfigurationReader.getProperty("student1_username"));
        inp_password.sendKeys(ConfigurationReader.getProperty("student1_password"));
        btn_signIn.click();
    }

    public void login_student(int num){
       String username_credential = "student" + num + "_username";
       String password_credential = "student" + num + "_password";

       inp_username.sendKeys(ConfigurationReader.getProperty(username_credential));
       inp_password.sendKeys(ConfigurationReader.getProperty(password_credential));
       btn_signIn.click();

    }

    public void login_librarian(int num){
        String username_credential = "librarian" + num + "_username";
        String password_credential = "librarian" + num + "_password";

        inp_username.sendKeys(ConfigurationReader.getProperty(username_credential));
        inp_password.sendKeys(ConfigurationReader.getProperty(password_credential));
        btn_signIn.click();

    }
    public void login_any_user(String user, String num){
        String username_credential = user + num + "_username";
        String password_credential = user + num + "_password";

        inp_username.sendKeys(ConfigurationReader.getProperty(username_credential));
        inp_password.sendKeys(ConfigurationReader.getProperty(password_credential));
        btn_signIn.click();

    }


}
