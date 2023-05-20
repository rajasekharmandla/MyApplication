package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class BaseClass {
        WebDriver driver;
        @BeforeTest
        public void setup() {
            // Set up the wWebDriverManager for chrome driver
            WebDriverManager.chromedriver().setup();
            // Create the driver object
            driver = new ChromeDriver();
        }

        @Test
        public void launchApplication(){
            // Open the browser and go to lambdatest ecommerce website
            driver.get("https://ecommerce-playground.lambdatest.io/");
            // Set the current url as a string
            String url = driver.getCurrentUrl();

        }

        @AfterTest
    public void tearDown(){
            driver.quit();
        }

}
