package com.chenmed.qatests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by anastasiyam on 12/19/2016.
 */



public class FindElementsInSite {

    private ChromeDriver _driver;
    private WebDriverWait wait;


    public FindElementsInSite(ChromeDriver driver) {
        this._driver = driver;
    }

    public void Search(){

        Login loginRun = new Login(_driver);
        String title=  loginRun.enter("http://localhost/litecart/public_html/admin/login.php","admin","admin");


        int  count=_driver.findElements (By.cssSelector("ul#box-apps-menu li#app-")).size();
        for (int i=0;i<count;i++) {
            _driver.findElements(By.cssSelector("ul#box-apps-menu li#app-")).get(i).click();
            //sleep(500) isElementPresent(By.tagName("h"); have to set up another function
            System.out.println(_driver.findElement(By.tagName("h1")).getText());

            if (_driver.findElements(By.cssSelector("ul#box-aaps-menu li.selected ul li")).size() != 0) {
                int newCount = _driver.findElements(By.cssSelector("ul#box-aaps-menu li.selected ul li")).size();
                for (int l = 0; l < newCount; l++) {
                    _driver.findElements(By.cssSelector("ul#box-apps-menu li#app-")).get(l).click();

                    System.out.println(_driver.findElement(By.tagName("h1")).getText());
                }
            }
        }
    }
}
