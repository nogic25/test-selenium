package com.chenmed.qatests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

//click Alt+Enter to import method


/**
 * Created by anastasiyam on 11/25/2016.
 */
public class Login {

    private WebDriverWait wait;
    private FirefoxDriver driver;


    @Before
    public void setup() {
        //web driver is an interface driver is an object
//
        System.setProperty("webdriver.gecko.driver", "C://Windows/geckodriver.exe");
        driver = new FirefoxDriver();
        wait=new WebDriverWait(driver,5);
    }

    @Test
    public void testNumberOne() {

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("london");
        driver.findElement(By.name("btnG")).click();
        System.out.println(driver.getTitle());
        wait.until(titleIs("Google"));
        //driver.findElement(By.linkText("Appointment")).click();
    }


    @After
    public void stop() {
        driver.close();
        driver=null;
    }



}