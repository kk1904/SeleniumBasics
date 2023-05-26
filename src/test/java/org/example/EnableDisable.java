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

public class EnableDisable {
    public WebDriver driver;
    public String url="https://www.letskodeit.com/practice";
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void checkEnableDisable() throws InterruptedException {
        driver.findElement(By.id("enabled-button")).click();
        boolean ans=driver.findElement(By.id("enabled-example-input")).isEnabled();
        assertTrue(ans);

        driver.findElement(By.id("enabled-example-input")).sendKeys("Krishna Vasani"); //to make it confirm whether it is enable, we can pass some text in that.
        Thread.sleep(3000);

        driver.findElement(By.id("disabled-button")).click();
        boolean ans2=driver.findElement(By.id("enabled-example-input")).isEnabled();
        assertFalse(ans2);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
