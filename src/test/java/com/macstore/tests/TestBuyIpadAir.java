package com.macstore.tests;

import com.macstore.pages.HomePage;
import com.macstore.pages.IpadPage;
import com.macstore.pages.PurchaseButtonsPage;
import com.macstore.utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBuyIpadAir {

    WebDriver driver;


    String url = "https://www.macstoreonline.com.mx";

    @BeforeSuite
    public void openBrowser(){
        driver = new SafariDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void openIpadCategory(){
        HomePage home;
        home = new HomePage(driver);

        home.clickIpadCategory();
    }

    @Test(priority = 2)
    public void selectIpadAir(){
        IpadPage ipad;
        ipad = new IpadPage(driver);

        ipad.selectIpadAir();
    }

    @Test(priority = 3)
    public void exploreProduct() {
        Helpers helpers;
        helpers = new Helpers(driver);

        helpers.scrollPageGradually();
    }

    @Test(priority = 4)
    public void buyIpadAir(){
        PurchaseButtonsPage purchase;
        purchase = new PurchaseButtonsPage(driver);

        purchase.clickComprar();
    }

    @Test(priority = 5)
    public void setIpadConfiguration(){
        IpadPage ipad;
        ipad = new IpadPage(driver);

        ipad.setMoradoColor();
        ipad.set256GbStorage();

    }

    @Test(priority = 6)
    public void addIpadToCart(){
        PurchaseButtonsPage purchase;
        purchase = new PurchaseButtonsPage(driver);

        purchase.addProductToCart();
    }

    


}
