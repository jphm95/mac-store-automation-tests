package com.macstore.pages;

import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IphonePage {

    WebDriver driver;
    WebDriverWait wait;
    Helpers helpers;

    //Locators:
    @FindBy(css = "body > div:nth-child(43) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1)")
    WebElement iPhone16Category;

    @FindBy(id = "256GB")
    WebElement storage256GB;

    @FindBy(css = "#Ultramarino")
    WebElement ultraMarinoColor;







}
