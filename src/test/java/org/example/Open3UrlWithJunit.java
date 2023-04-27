package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open3UrlWithJunit {
    public WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public  void openNetflixUrl(){
        driver.get("https://www.netflix.com");
    }
    @Test
    public void openNextUrl(){
        driver.get("https://www.next.co.uk/");
    }
    @Test
    public void openBAndQ(){
        driver.get("https://www.diy.com/");
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
