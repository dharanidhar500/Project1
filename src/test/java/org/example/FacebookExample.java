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

public class FacebookExample {
    ChromeDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {

        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    void applySelectors() throws InterruptedException {
//        driver.findElement(By.cssSelector("input#email")).sendKeys("abc@123");
//        Thread.sleep(1000);
      //  driver.findElement(By.cssSelector("input[name=email]")).sendKeys("hello@gmail.com");
      //  Thread.sleep(2000);
       // driver.findElement(By.cssSelector("input.inputtext[name=email")).sendKeys("dharanidhar510@gmail.com");
      //  Thread.sleep(2000);
     // driver.findElement(By.cssSelector("input#pass")).sendKeys("dharani1430");
      //Thread.sleep(2000);
      //driver.findElement(By.cssSelector("button._42ft[name=login]")).click();
     // Thread.sleep(8000);
        //absolute xpath
//      driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("standard_user");
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("secret_sauce");
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
//      Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@id, 'user')]")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(3000);
      //    }
        //BY tag,class,attribute
    }
        @AfterClass
        void close(){
            driver.close();
        }
    }
    // xpath is a syntax or language for finding any element on the webpage using xml path expression//
//Syntax to write relative xpath start with//tag name[@attribute ="value"]//
//tag name[contains(attribute,value)]