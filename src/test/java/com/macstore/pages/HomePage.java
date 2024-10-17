package com.macstore.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators:

    @FindBy(linkText =  "Mac")
    WebElement textMac;

    //Constructor:
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void goMacCategory(){
        textMac.click();
    }





}
