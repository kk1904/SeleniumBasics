package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SignInText {
    public WebDriver driver;
    public String url= "https://www.letskodeit.com/practice";
    String expectedText= "SIGN IN";
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    //expectedText="SIGN IN"
    //actualText=??
    @Test
    public void testSignInText(){
        String actualText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/div[2]/div/div/a")).getText();
        System.out.println(actualText);
        assertEquals("Text is not equal,Test Failed",expectedText,actualText);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
