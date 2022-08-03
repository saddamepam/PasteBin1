package org.example;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PasteBin1 {
    @Test
    public  void pasteBin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");
        driver.findElement(By.xpath("//*[@id=\"postform-text\"]")).sendKeys("Hello from WebDriver");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        driver.findElement(By.xpath("//*[@id=\"select2-postform-expiration-container\"]")).click();
        driver.findElement(By.xpath("/html/body/span[2]/span/span[2]/ul/li[3]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        driver.findElement(By.id("postform-name")).sendKeys("helloweb");
        driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button")).click();
    }
}