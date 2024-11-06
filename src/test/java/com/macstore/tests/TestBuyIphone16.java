package com.macstore.tests;

import com.macstore.pages.HomePage;
import com.macstore.pages.IpadPage;
import com.macstore.pages.IphonePage;
import com.macstore.pages.PurchaseButtonsPage;
import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBuyIphone16 {
    WebDriver driver;

    String url = "https://www.macstoreonline.com.mx";

    @BeforeSuite
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void openIphoneCategory(){
        HomePage home;
        home = new HomePage(driver);

        home.clickIphoneCategory();
    }

    @Test(priority = 2)
    public void selectIphone16(){
        IphonePage iphone;
        iphone = new IphonePage(driver);

        iphone.selectIphone16();
    }

    @Test(priority = 3)
    public void exploreProduct(){
        Helpers helpers;
        helpers = new Helpers(driver);

        helpers.scrollPageGradually();
    }

    @Test(priority = 4)
    public void buyIphone16(){
        PurchaseButtonsPage purchase;
        purchase = new PurchaseButtonsPage(driver);

        purchase.clickComprar();
    }

    @Test(priority = 5)
    public void setIphoneConfiguration(){
        IphonePage iphone;
        iphone = new IphonePage(driver);

        iphone.setUltraMarinoColor();
        iphone.setStorage256GB();
    }

    @Test(priority = 6)
    public void addIphoneToCart(){
        PurchaseButtonsPage purchase;
        purchase = new PurchaseButtonsPage(driver);

        purchase.addProductToCart();
    }





}
