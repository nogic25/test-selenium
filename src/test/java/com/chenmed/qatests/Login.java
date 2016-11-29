package com.chenmed.qatests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//clic Alt+Enter to import method
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
        wait=new WebDriverWait(driver,10);
    }

    @Test
    public void testNumberOne() {

        driver.get("https://stgdash.chenmed.com/PMR/logon.htm");
        driver.findElementById("username").sendKeys("anastasiyam");
        driver.findElement(By.id("password")).sendKeys("Tigger33");
        driver.findElementByClassName("logon").click();
        wait.until(titleIs("My Work"));
        //driver.findElement(By.linkText("Appointment")).click();
    }


    @After
    public void stop() {
        driver.close();
        driver=null;
    }



}