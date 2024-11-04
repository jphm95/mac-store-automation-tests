package com.macstore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppleCarePage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators

    @FindBy(css = "#botonAgregarModalAC2")
    WebElement addAppleCareButton;

    @FindBy(css = "#botonAgregarModalAC1")
    WebElement notAppleCareButton;

    // Constructor

    public AppleCarePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait (driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);

    }

    // Methods:

    public void clickAddAppleCare(){
        addAppleCareButton.click();
    }

    public void clickNotAppleCare(){
        notAppleCareButton.click();
    }






}
