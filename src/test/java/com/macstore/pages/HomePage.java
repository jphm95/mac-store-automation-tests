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

    @FindBy(css =  ".dropdown-toggle.remove-click-mobile[href='/details/categoria-mac']")
    WebElement textMac;

    @FindBy(css = ".dropdown-toggle.remove-click-mobile[href='/details/categoria-ipad']")
    WebElement textIpad;

    @FindBy(css = ".dropdown-toggle.remove-click-mobile[href='/details/categoria-iphone']")
    WebElement textIphone;

    @FindBy(css = ".dropdown-toggle.remove-click-mobile[href='/details/categoria-watch']")
    WebElement textWatch;


    //Constructor:
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void clickMacCategory(){
        textMac.click();
    }

    public void clickIpadCategory(){
        textIpad.click();
    }

    public void clickIphoneCategory(){
        textIphone.click();
    }

    public void clickWatchCategory(){
        textWatch.click();
    }





}
