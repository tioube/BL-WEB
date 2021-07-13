package com.test.bukalapak;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObject.RegisterObject;
import pageObject.Utils;


import java.util.concurrent.TimeUnit;


public class TestRegister {

    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in pageObject.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "register")
    public static void register() throws InterruptedException {
        driver.get(Utils.REGISTER_URL);
        RegisterObject RegisterObject = new RegisterObject(driver);
        RegisterObject.getTitle();
        RegisterObject.registar();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
