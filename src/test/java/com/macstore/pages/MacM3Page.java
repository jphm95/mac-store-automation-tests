package com.macstore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacM3Page {

    @FindBy(id = "comprarLink")
    WebElement buyButton;

    @FindBy(css = "body > div:nth-child(69) > div:nth-child(12) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(11) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > li:nth-child(1)")
    WebElement gpu10radioButton;

    @FindBy(css = ".textoColor.Medianoche1")
    WebElement medianocheColorButton;

    @FindBy(css = "body > div:nth-child(69) > div:nth-child(12) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(13) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > li:nth-child(1)")
    WebElement gb16radioButton;

    /*@FindBy(css = )
    WebElement ; */

    @FindBy(id = "menu-toggle")
    WebElement addCartButton;













}
