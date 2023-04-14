package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.TestNGAntTask.Mode.junit;

public class AppTest {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //for window to maximize
    }
    @Test
    public void googleTest() throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");//user-name
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("secret_sauce");//user-name
        Thread.sleep(1000);
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(2000);
       // driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();  //By using linkText
        // driver.findElement(By.partialLinkText("Sauce")).click();            //By using partialLinkText

        Thread.sleep(3000);
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);
        List<WebElement>list = driver.findElements(By.partialLinkText("Labs"));
        list.get(1).click();
        Thread.sleep(1000);
        List<WebElement> li = driver.findElements(By.tagName("a"));
        System.out.println(li.size());
        //        String a = driver.findElement(By.className("inventory_details_price")).getText();
//        System.out.printf(a);
//        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("shopping_cart_container")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("checkout")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("first-name")).sendKeys("Rohan");//firstname
//        driver.findElement(By.id("last-name")).sendKeys("kumar");//lastname
//        driver.findElement(By.id("postal-code")).sendKeys("123456");//pincode
//        Thread.sleep(2000);
//        driver.findElement(By.id("continue")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("finish")).click();
//        Thread.sleep(3000);

    }
    @AfterClass
    void close(){
        driver.close();
    }


}