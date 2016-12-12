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
public class LoginLiteCart_FIndElements {

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
        wait.until(titleIs("My Store"));
        //appearance
        driver.findElement(By.xpath(".//li[1][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-template']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-logotype']/a/span")).click();
        System.out.println(driver.getTitle());
        //catalog
        driver.findElement(By.xpath(".//li[2][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-catalog']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-product_groups']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-option_groups']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-manufacturers']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-suppliers']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-delivery_statuses']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-sold_out_statuses']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-quantity_units']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-csv']/a/span")).click();
        System.out.println(driver.getTitle());
        //countries
        driver.findElement(By.xpath(".//li[3][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        //Currencies
        driver.findElement(By.xpath(".//li[4][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        //Customers
        driver.findElement(By.xpath(".//li[5][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-customers']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-csv']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-newsletter']/a/span")).click();
        System.out.println(driver.getTitle());
        //Geo Zones
        driver.findElement(By.xpath(".//li[6][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        //Languages
        driver.findElement(By.xpath(".//li[7][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-languages']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-storage_encoding']/a/span")).click();
        System.out.println(driver.getTitle());
        //Modules
        driver.findElement(By.xpath(".//li[8][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-jobs']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-customer']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-shipping']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-payment']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-order_total']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-order_success']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-order_action']/a/span")).click();
        System.out.println(driver.getTitle());
        //Orders
        driver.findElement(By.xpath(".//li[9][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-orders']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-order_statuses']/a/span")).click();
        System.out.println(driver.getTitle());
        //Pages
        driver.findElement(By.xpath(".//li[10][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        //Reports
        driver.findElement(By.xpath(".//li[11][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-monthly_sales']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-most_sold_products']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-most_shopping_customers']/a/span")).click();
        System.out.println(driver.getTitle());
        //Settings
        driver.findElement(By.xpath(".//li[12][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-store_info']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-defaults']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-general']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-listings']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-images']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-checkout']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-advanced']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-security']/a/span")).click();
        System.out.println(driver.getTitle());
        //Slides
        driver.findElement(By.xpath(".//li[13][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        //Tax
        driver.findElement(By.xpath(".//li[14][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-tax_classes']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-tax_rates']/a/span")).click();
        System.out.println(driver.getTitle());
        //Translations
        driver.findElement(By.xpath(".//li[15][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-search']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-scan']/a/span")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-csv']/a/span")).click();
        System.out.println(driver.getTitle());
        //Users
        driver.findElement(By.xpath(".//li[16][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        //vqmods
        driver.findElement(By.xpath(".//li[17][@id='app-']/a/span[2]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='doc-vqmods']/a/span")).click();
        System.out.println(driver.getTitle());
    }




    @After
    public void stop() {
        driver.close();
        driver = null;
    }


}
