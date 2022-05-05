package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
        Thread.sleep(2000);

        Select selectDay = new Select(driver.findElement(By.xpath("//div[contains(@class, \"_5k_5\")]/span/span/select[1]")));
        selectDay.selectByIndex(0);

        Select selectMonth = new Select(driver.findElement(By.xpath("//div[contains(@class, \"_5k_5\")]/span/span/select[2]")));
        selectMonth.selectByIndex(1);

        Select selectYear = new Select(driver.findElement(By.xpath("//div[contains(@class, \"_5k_5\")]/span/span/select[3]")));
        selectYear.selectByIndex(2);
    }
}