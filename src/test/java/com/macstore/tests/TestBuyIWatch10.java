package com.macstore.tests;

import com.macstore.pages.HomePage;
import com.macstore.pages.PurchaseButtonsPage;
import com.macstore.pages.WatchPage;
import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBuyIWatch10 {

    WebDriver driver;

    String url = "https://www.macstoreonline.com.mx";

    @BeforeSuite
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void openWatchCategory(){
        HomePage home;
        home = new HomePage(driver);

        home.clickWatchCategory();

    }

    @Test(priority = 2)
    public void selectWatch10(){
        WatchPage watch;
        watch = new WatchPage(driver);

        watch.selectWatch10();
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
    public void setWatchConfiguration(){
        WatchPage watch;
        watch = new WatchPage(driver);

        watch.setPlataColor();
        watch.setGpsFeature();
        watch.setSize46();
    }

    @Test(priority = 6)
    public void addWatchToCart(){
        PurchaseButtonsPage purchase;
        purchase = new PurchaseButtonsPage(driver);

        purchase.addProductToCart();
    }





}
