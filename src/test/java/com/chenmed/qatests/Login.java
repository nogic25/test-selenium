package com.chenmed.qatests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//click Alt+Enter to import method
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


/**
 * Created by anastasiyam on 11/25/2016.
 */
public class Login {

    private WebDriverWait wait;
    private ChromeDriver driver;


    @Before
    public void setup() {
        //web driver is an interface driver is an object
//
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
        driver = new ChromeDriver();
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