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
    public void openNextUrl() throws InterruptedException {
        driver1.get("https://www.next.co.uk/");
        Thread.sleep(3000);
        driver1.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver1.findElement(By.xpath("/html/body/div[2]/div/section/header/div[1]/nav/div[2]/div[2]/div[2]/div/a")).click();
    }
    @After
    public void tearDown(){
        driver1.close();
    }
}
