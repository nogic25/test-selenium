package com.chenmed.qatests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by anastasiyam on 12/11/2016.
 */

public class Test_Base {

    public WebDriverWait wait;
    public ChromeDriver driver;
    public By bySearchButton = By.name("login");

    @Before
    public void setup() {
        //web driver is an interface driver is an object
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);

    }
    @Test
    public void loginAs() {
        //how to change String to Character

        driver.get("http://localhost/litecart/public_html/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        WebElement element=driver.findElement(bySearchButton) ;
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getAttribute("border"));
        element.click();
        wait.until(titleIs("My Store"));
        driver.findElement(By.xpath(".//*[@id='sidebar']/div[2]/a[1]/i")).click();
        System.out.println(driver.getTitle());
        //Most popular
        int count = driver.findElements(By.cssSelector("div#box-most-popular ul li a.link  div.image-wrapper img")).size();
        for (int i = 0; i < count; i++) {
        driver.findElements(By.cssSelector("div#box-most-popular ul li a.link  div.image-wrapper img")).get(i);
        System.out.println(driver.getTitle());
        //System.out.println(driver.findElement(By.tagName("h1")).getText());
        if(driver.findElement(By.cssSelector("div#box-most-popular  ul li a.link div.image-wrapper div")).isDisplayed())
        {
            System.out.println("Sticker is displayed");
        }
        else {
            System.out.println("Sticker is not displayed");
        }
    }

//Campaigns
int countCamp = driver.findElements(By.cssSelector("div#box-compaigns ul li a.link  div.image-wrapper img")).size();
        for (int b = 0; b < countCamp; b++) {
        driver.findElements(By.cssSelector("div#box-compaigns ul li a.link  div.image-wrapper img")).get(b);
        System.out.println(driver.getTitle());
        //System.out.println(driver.findElement(By.tagName("h1")).getText());
        if(driver.findElement(By.cssSelector("div#box-compaigns  ul li a.link div.image-wrapper div")).isDisplayed())
        {
            System.out.println("Sticker is displayed");
        }
        else {
            System.out.println("Sticker is not displayed");
        }
    }

        int countLate = driver.findElements(By.cssSelector("div#box-latest-products  ul li a.link  div.image-wrapper img")).size();
        for (int b = 0; b < countLate; b++) {
            driver.findElements(By.cssSelector("div#box-latest-products  ul li a.link  div.image-wrapper img")).get(b);
            System.out.println(driver.getTitle());
            //System.out.println(driver.findElement(By.tagName("h1")).getText());
            if(driver.findElement(By.cssSelector("div#box-latest-products   ul li a.link div.image-wrapper div")).isDisplayed())
            {
                System.out.println("Sticker is displayed");
            }
            else {
                System.out.println("Sticker is not displayed");
            }
        }
}
    @After
    public void stop() {
        driver.close();
        driver = null;
    }


}