package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
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
    public void testDropDownList() throws InterruptedException {
        WebElement dropDown= driver.findElement(By.id("carselect"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("Honda");
        Thread.sleep(3000);

        select.selectByIndex(0);
        Thread.sleep(3000);

        select.selectByValue("benz");
        Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
