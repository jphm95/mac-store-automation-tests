package com.macstore.pages;

import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IpadPage {

    WebDriver driver;
    WebDriverWait wait;
    Helpers helpers;


    //Locators:

    //Model:
    @FindBy(css = "body > div:nth-child(44) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > div:nth-child(1)")
    WebElement iPadAir;

    //Colors:

    @FindBy(css = "#Morado")
    WebElement moradoColor;

   //Storage:
    @FindBy(id = "256GB")
    WebElement gb256Button;


    //Constructor:
    public  IpadPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void selectIpadAir(){
        wait.until(ExpectedConditions.elementToBeClickable(iPadAir));
        iPadAir.click();
    }

    public void setMoradoColor(){
        helpers.jsClick(moradoColor);
    }

    public void set256GbStorage(){
        helpers.jsClick(gb256Button);
    }







}
