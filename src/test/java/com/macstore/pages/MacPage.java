package com.macstore.pages;

import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MacPage {

    WebDriver driver;
    WebDriverWait wait;
    Helpers helpers;



    @FindBy(css = "body > div:nth-child(43) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1)")
    WebElement macM3Category;


    @FindBy(id = "10GPU")
    WebElement gpu10radioButton;

    @FindBy(css = "#Medianoche")
    WebElement medianocheColorButton;

    @FindBy(id = "16GB")
    WebElement gb16radioButton;

    /*@FindBy(css = )
    WebElement ; */

    @FindBy(id = "menu-toggle")
    WebElement addCartButton;



    // Constructor

    public MacPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.helpers = new Helpers(driver);
        PageFactory.initElements(driver, this);
    }


    public void selectMacM3Category() {
        wait.until(ExpectedConditions.elementToBeClickable(macM3Category));
        macM3Category.click();
    }

    public void  set10Gpu(){
        helpers.jsClick(gpu10radioButton);
    }

    public void setMidnightColor(){
        helpers.scrollToElement(medianocheColorButton);
        helpers.jsClick(medianocheColorButton);
    }

    public void set16GbRam(){
        helpers.jsClick(gb16radioButton);
    }















}
