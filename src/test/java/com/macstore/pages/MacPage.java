package com.macstore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MacPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators:
    @FindBy(css = "div[class='row'] div:nth-child(1) a:nth-child(1) div:nth-child(1) div:nth-child(2)")
    WebElement macM3Category;


    public MacPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void selectMacM3Category(){
        macM3Category.click();
    }





}
