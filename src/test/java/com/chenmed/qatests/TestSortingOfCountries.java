package com.chenmed.qatests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by anastasiyam on 12/21/2016.
 */
public class TestSortingOfCountries {

    private WebDriverWait wait;
    private ChromeDriver driver;

    @Before
    public void setup() {
        //web driver is an interface driver is an object
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
         driver = new ChromeDriver();
         wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void TestSorting() {

        Login loginrun = new Login(driver);
        loginrun.enter("http://localhost/litecart/public_html/admin/login.php", "admin", "admin");
        driver.findElement(By.xpath(".//li[3][@id='app-']/a/span[2]")).click();

        //create an LinkedList instead of arraylist because it preserves insertion order

        //"ul[@id='box-apps-menu']//span[text()=Countries']"

        List<WebElement> countries = new LinkedList<WebElement>();

        //store the products (web elements) into the linkedlist
        countries = driver.findElements(By.cssSelector("a[href*='?app=countries&doc=countries'].name"));

        //create another linked list of type string to store  titles
        LinkedList<String> countries_names =  new LinkedList<String>();

        //loop through all the elements of the product_webelement list get it title and store it into the product_names list
        for (int i = 0; i < countries.size(); i++) {

            String s = countries.get(i).getAttribute("text");
            product_names.add(s);

            if (driver.findElements(By.cssSelector("a[href*='?app=countries&doc=countries'].name td")).size()!=0);


            List<WebElement> zones = new LinkedList<WebElement>();

            countries = driver.findElements(By.cssSelector("a[href*='?app=countries&doc=countries'].name td"));
            List<String> zones_names=new LinkedList<String>();





        }

        boolean result=chkalphabetical_order(product_names);
        // print the result
        System.out.println(result);
    }
        public boolean chkalphabetical_order(List<String>product_names)
        {

            String previous = ""; // empty string

            for (final String current: product_names) {
                if (current.compareTo(previous) < 0)
                    return false;
                previous = current;
            }

            return true;

        }

    @After
    public void stop() {
        driver.close();
        driver = null;
    }
    }




