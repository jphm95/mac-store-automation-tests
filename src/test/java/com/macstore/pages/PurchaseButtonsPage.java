package com.macstore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseButtonsPage {

    WebDriver driver;

    //Locators:
    @FindBy(id= "comprarLink")
    WebElement buyButton;

    @FindBy(id = "menu-toggle")
    WebElement addToCartButton;

    //Constructor:
    public PurchaseButtonsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickComprar(){
        buyButton.click();
    }

    public void addProductToCart(){
        addToCartButton.click();
    }





}
