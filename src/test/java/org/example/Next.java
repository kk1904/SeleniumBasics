package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Next {
    public WebDriver driver1;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver1= new ChromeDriver();
        driver1.manage().window().maximize();
    }
    @Test
    public void openNextUrl(){
        driver1.get("");
        driver1.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @After
    public void tearDown(){
        driver1.close();
    }
}
