package com.chenmed.qatests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by anastasiyam on 12/7/2016.
 */
public class LoginLiteCart_FIndElements  {
        //extends TestBase
    private WebDriverWait wait;
    private ChromeDriver driver;

    @Before
    public void setup() {
        //web driver is an interface driver is an object
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }
//public void testAllItemMenuCLick() throws Exception{
    //openLiteCartAdmin()
    //loginLiteCart("admin","admin")

    @Test
    public void testClickAllItemMenu() {

        driver.get("http://localhost/litecart/public_html/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());
        wait.until(titleIs("My Store"));
        //appearance

          int  count=driver.findElements (By.cssSelector("ul#box-apps-menu li#app-")).size();
        for (int i=0;i<count;i++) {
            driver.findElements(By.cssSelector("ul#box-apps-menu li#app-")).get(i).click();
            //sleep(500) isElementPresent(By.tagName("h"); have to set up another function
            System.out.println(driver.findElement(By.tagName("h1")).getText());

            if (driver.findElements(By.cssSelector("ul#box-aaps-menu li.selected ul li")).size()!=0){
                int newCount=driver.findElements(By.cssSelector("ul#box-aaps-menu li.selected ul li")).size();
                for(int l=0;l<newCount;l++){
                    driver.findElements(By.cssSelector("ul#box-apps-menu li#app-")).get(l).click();

                    System.out.println(driver.findElement(By.tagName("h1")).getText());
                }


            }

        }


        }

    @After
    public void stop() {
        driver.close();
        driver = null;
    }


}

