package com.chenmed.qatests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by anastasiyam on 12/7/2016.
 */
public class Firefox_access {
    private WebDriverWait wait;
    private ChromeDriver driver;


    @Before
    public void setup() {
        //web driver is an interface driver is an object
//
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void testLoginLiteCart() {

        driver.get("http://localhost/litecart/public_html/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());
        //wait.until(titleIs("Google"));
        //driver.findElement(By.linkText("Appointment")).click();
    }


    @After
    public void stop() {
        driver.close();
        driver = null;
    }


}
