package com.macstore.pages;

import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IphonePage {

    WebDriver driver;
    WebDriverWait wait;
    Helpers helpers;

    //Locators:
    @FindBy(css = "body > div:nth-child(42) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1)")
    WebElement iPhone16;

    @FindBy(id = "256GB")
    WebElement storage256GB;

    @FindBy(css = "#Ultramarino")
    WebElement ultraMarinoColor;

    //Constructor:
    public IphonePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.helpers = new Helpers(driver);
        PageFactory.initElements(driver, this);

    }

    //Methods:

    public void selectIphone16(){
        wait.until(ExpectedConditions.elementToBeClickable(iPhone16));
        iPhone16.click();
    }

    public void setUltraMarinoColor(){
        ultraMarinoColor.click();
    }

    public void setStorage256GB(){
        storage256GB.click();
    }







}
