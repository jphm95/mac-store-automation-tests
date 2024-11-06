package com.macstore.pages;

import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WatchPage {

    WebDriver driver;
    WebDriverWait wait;
    Helpers helpers;

    //Locators:
    @FindBy(css = "body > div:nth-child(43) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
    WebElement watch10;

    @FindBy(id = "Plata")
    WebElement plataColor;

    @FindBy(id = "GPSCellular")
    WebElement gpsFeature;

    @FindBy(css = "div[id='Pulgada6'] div[class='borderM']")
    WebElement size46;

    //Constructor:
    public WatchPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.helpers = new Helpers(driver);
    }


    //Methods:

    public void selectWatch10(){
        wait.until(ExpectedConditions.visibilityOf(watch10));
        helpers.jsClick(watch10);
    }

    public void setPlataColor(){
        plataColor.click();
    }

    public void setGpsFeature(){
        gpsFeature.click();
    }

    public void setSize46(){
        size46.click();
    }



}
