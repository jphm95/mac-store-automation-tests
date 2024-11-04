package com.macstore.tests;

import com.macstore.pages.HomePage;
import com.macstore.pages.MacPage;
import com.macstore.pages.PurchaseButtonsPage;
import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBuyIWatch10 {

    WebDriver driver;

    String url = "";

    @BeforeSuite
    public void openBrowser(){
        driver = new SafariDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

//    @Test(priority = 1)
//    public void openWatchCategory(){
//        HomePage home;
//        home = new HomePage(driver);
//
//        home.clickCategory();
//
//    }
//
//    @Test(priority = 2)
//    public void selectWatch10Category(){
//        MacPage mac;
//        mac = new MacPage(driver);
//
//        mac.selectCategory();
//
//    }
//    @Test(priority = 3)
//    public void exploreProduct() {
//        Helpers helpers;
//        helpers = new Helpers(driver);
//
//        helpers.scrollPageGradually();
//    }
//
//    @Test(priority = 4)
//    public void buyProduct() {
//        PurchaseButtonsPage purchase;
//        purchase = new PurchaseButtonsPage(driver);
//
//        purchase.clickComprar();
//    }





}
