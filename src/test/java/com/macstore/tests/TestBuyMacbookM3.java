package com.macstore.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;

public class TestBuyMacbookM3 {

    WebDriver driver;

    String url = "";

    @BeforeSuite
    public void openBrowser(){
        driver = new SafariDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }








}
