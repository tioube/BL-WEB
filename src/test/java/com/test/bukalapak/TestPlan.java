package com.test.bukalapak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObject.Login;
import pageObject.addToChart;
import pageObject.Utils;


import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in pageObject.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Login Page")
    public static void Login() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Login login = new Login(driver);
        login.enterFirstName();
        login.enterLastName();
        login.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        login.verifyLoginSuccess();
        Thread.sleep(2000);

    }

    @Test(testName = "Add Product to Cart")
    public static void setCart() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        addToChart addToChart = new addToChart(driver);
        addToChart.searchProduct();
        addToChart.addProduct();
        addToChart.SetAddCart();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}