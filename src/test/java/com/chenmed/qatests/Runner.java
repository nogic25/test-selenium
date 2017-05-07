package com.chenmed.qatests;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by anastasiyam on 12/19/2016.
 */
public class Runner {

    private WebDriverWait wait;
    private ChromeDriver driver;

    @Before
    public void setup() {
        //web driver is an interface driver is an object
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       WebDriverWait wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void LoginTestShouldPass(){

        System.out.println("BEGIN THE TEST");
//encapsulation of Login Class
        Login loginRun = new Login(driver);


        String title =  loginRun.enter("http://localhost/litecart/public_html/admin/login.php","admin","admin");

        String currentUrl = driver.getCurrentUrl();

        //Assert.assertThat(currentUrl, CoreMatchers.containsString("login"));

        System.out.println("FINISH THE TEST");
//encapsulation of Login Class
        FindElementsInSite findElementsInSite=new FindElementsInSite(driver);

        findElementsInSite.Search();

        //FindElementsInSite findElementsInSite = new FindElementsInSite(driver);

    }

    @Test
    public void LoginTestShouldFail(){

        System.out.println("BEGIN THE TEST");

        Login login = new Login(driver);

        String title =  login.enter("http://localhost/litecart/public_html/admin/login.php","admin","admin");
        String currentUrl = driver.getCurrentUrl();

        Assert.assertThat(currentUrl, CoreMatchers.containsString("login"));

        System.out.println("FINISH THE TEST");
    }

    @After
    public void stop() {
        driver.close();
        driver = null;
    }

}
