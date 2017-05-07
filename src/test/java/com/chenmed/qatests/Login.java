package com.chenmed.qatests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by anastasiyam on 12/19/2016.
 */
public class Login {

    private ChromeDriver _driver;

    public Login(ChromeDriver driver) {
      this._driver = driver;
    }

    public String enter(String url,String username, String password){

        _driver.get(url);
        _driver.findElement(By.name("username")).sendKeys(username);
        _driver.findElement(By.name("password")).sendKeys(password);
        _driver.findElement(By.name("login")).click();

        String title = _driver.getTitle();
        System.out.println(title);

        return title;
    }
}
