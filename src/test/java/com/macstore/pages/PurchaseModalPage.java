package com.macstore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PurchaseModalPage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators

    @FindBy(id = "")
    WebElement onePaymentRadialButton;

    @FindBy(id = "")
    WebElement monthlyPayments;

    @FindBy(id= "")
    WebElement proceedToPaymentButton;

    //Constructor:
    public PurchaseModalPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void selectOnePayment(){
        onePaymentRadialButton.click();

    }

    public void selectMonthlyPayments(){
        monthlyPayments.click();
    }

    public void clickProceedToPayment(){
        proceedToPaymentButton.click();
    }



}
