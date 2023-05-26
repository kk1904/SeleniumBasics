package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HideShow {
    public WebDriver driver;
    public String url= "https://www.letskodeit.com/practice";
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void checkHideAndSHow() throws InterruptedException {
        driver.findElement(By.id("hide-textbox")).click();
        boolean ans= driver.findElement(By.id("displayed-text")).isDisplayed();
        assertFalse(ans);
        Thread.sleep(3000);

        driver.findElement(By.id("show-textbox")).click();
        boolean ans2= driver.findElement(By.id("displayed-text")).isDisplayed();
        assertTrue(ans2);
        Thread.sleep(3000);

        driver.findElement(By.id("displayed-text")).sendKeys("Krishna Vasani");
        Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
