package com.practice.qatest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by anastasiyam on 12/19/2016.
 */
public class Login {

    private ChromeDriver driver;

    Login(ChromeDriver driver){
        driver  = driver;
    }

    public void enter(String url,String username, String password){
        driver.get(url);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();
        System.out.println(driver.getTitle());
    }
}
