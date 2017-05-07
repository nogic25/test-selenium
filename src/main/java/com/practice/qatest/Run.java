package com.practice.qatest;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by anastasiyam on 12/19/2016.
 */
public class Run {

    private WebDriverWait wait;
    private ChromeDriver driver;

    @Before
    public void setup() {
        //web driver is an interface driver is an object
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

    public void main(String[] args){

        Login login = new Login(driver);
        login.enter("http://localhost/litecart/public_html/admin/login.php","admin","admin");

    }



}
