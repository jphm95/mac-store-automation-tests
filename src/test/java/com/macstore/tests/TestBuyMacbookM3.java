package com.macstore.tests;

import com.macstore.pages.*;
import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBuyMacbookM3 {

    WebDriver driver;

    String url = "https://www.macstoreonline.com.mx";

    @BeforeSuite
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void openMacCategory(){
        HomePage home;
        home = new HomePage(driver);

        home.clickMacCategory();

    }

    @Test(priority = 2)
    public void selectMacM3Category(){
        MacPage mac;
        mac = new MacPage(driver);

        mac.selectMacM3Category();

    }
    @Test(priority = 3)
    public void exploreProduct() {
        Helpers helpers;
        helpers = new Helpers(driver);

        helpers.scrollPageGradually();
    }

    @Test(priority = 4)
    public void buyProduct() {
        PurchaseButtonsPage purchase;
        purchase = new PurchaseButtonsPage(driver);

        purchase.clickComprar();
    }


    @Test(priority = 5)
    public void setMacM3Configuration(){
        MacPage mac;
        mac = new MacPage(driver);

        mac.set10Gpu();
        mac.setMidnightColor();
        mac.set16GbRam();
    }

    @Test(priority = 6)
    public void addMacToCart(){
        PurchaseButtonsPage purchase;
        purchase = new PurchaseButtonsPage(driver);

        purchase.addProductToCart();
    }

    @Test(priority = 7)
    public void avoidAppleCare(){
        AppleCarePage appleCare;
        appleCare = new AppleCarePage(driver);

        appleCare.clickNotAppleCare();

    }

    @Test(priority = 8)
    public void closeExtraProductModal(){
        ExtraProductsModalPage extraProducts;
        extraProducts = new ExtraProductsModalPage(driver);

        extraProducts.closeModal();
    }








}
