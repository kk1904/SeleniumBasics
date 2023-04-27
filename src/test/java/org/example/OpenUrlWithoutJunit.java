package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class OpenUrlWithoutJunit {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.netflix.com");

        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk/");

        driver.manage().window().maximize();
        driver.get("https://www.diy.com/");

        driver.close();
    }

}
