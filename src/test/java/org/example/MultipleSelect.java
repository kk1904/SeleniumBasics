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

public class MultipleSelect {
    public WebDriver driver;
    public String url= "https://www.letskodeit.com/practice";
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void testMultipleSelect() throws InterruptedException {
        WebElement multipleSelect= driver.findElement(By.id("multiple-select-example"));
        Select select=new Select(multipleSelect);
        select.selectByVisibleText("Apple");
        Thread.sleep(3000);

        select.selectByIndex(1);
        Thread.sleep(3000);

        select.selectByValue("peach");
        Thread.sleep(3000);
    }

    @After
        public void tearDown(){
            driver.close();
        }
}
