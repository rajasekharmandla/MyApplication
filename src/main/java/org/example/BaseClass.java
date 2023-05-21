package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;



public class BaseClass {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
        // Set up the wWebDriverManager for chrome driver
        WebDriverManager.chromedriver().setup();
        // Open the browser and go to lambdatest ecommerce website
        driver.get("https://ecommerce-playground.lambdatest.io/");
        // Set the current url as a string
        String sTitle = driver.getTitle();
        Assert.assertTrue(sTitle.equals("Your Store"), "Ecommerce Launched successfully");
    }

}
