package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//a[.='Log Out']")
    public WebElement btn_logout;

    @FindBy(xpath = "//span[.='Test Librarian 11']")
    public WebElement icon_profile;


  public void navigate_to_link(String linkName){
        String locator ="//span[.='"+linkName+"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
  }

  public void logout(){
      icon_profile.click();
      btn_logout.click();
  }









}