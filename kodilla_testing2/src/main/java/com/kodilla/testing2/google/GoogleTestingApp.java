package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "q";
    public static void main(String[] args) {
               WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
               webDriver.get("https://www.google.com");
              //webDriver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click(); // [4]

               WebElement searchField = webDriver.findElement(By.name(SEARCHFIELD));      // [5]
               searchField.sendKeys("Kodilla");
               searchField.submit();
           }
    }
