package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class RadioButton {
    public WebDriver driver;
    public String url="https://www.letskodeit.com/practice";
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void testRadioButton() throws InterruptedException {
        driver.findElement(By.id("benzradio")).click();
        Thread.sleep(3000);
        boolean ans= driver.findElement(By.id("benzradio")).isSelected();
        assertEquals(true,ans);
        Thread.sleep(3000);

        boolean ans2= driver.findElement(By.id("hondaradio")).isSelected();
        assertEquals(false,ans);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
