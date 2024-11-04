package com.macstore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExtraProductsModalPage {
    WebDriver driver;

    //Locators:

    @FindBy(css = ".continuarcompracomp")
    WebElement noThanksCloseModal;


    //Constructor:
    public ExtraProductsModalPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void closeModal(){
        noThanksCloseModal.click();
    }





}
