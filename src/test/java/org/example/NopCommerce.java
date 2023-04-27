package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class NopCommerce {
    public WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void login() throws InterruptedException {
        driver.get("http://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("Email")).sendKeys("vk1904@gmail.com");//find element Email textbox by its name and assign/enter the values via sendkeys methods
        driver.findElement(By.name("Password")).sendKeys("123456"); //find element Password textbox by its name and assign/enter the values
        Thread.sleep(3000);
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void registration() throws InterruptedException {
        driver.get("http://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Krishna");
        driver.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys("vasani");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/input")).sendKeys("vk1904@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.className("register-next-step-button")).click();
        Thread.sleep(3000);
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
