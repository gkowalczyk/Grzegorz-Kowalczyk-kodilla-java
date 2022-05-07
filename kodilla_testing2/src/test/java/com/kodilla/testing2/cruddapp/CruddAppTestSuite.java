package com.kodilla.testing2.cruddapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CruddAppTestSuite {
    private static final String BASE_URL = "https://gkowalczyk.github.io/";
    private WebDriver driver;
    private Random generator;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @AfterEach
    public void cleanUpAfterTest() {
         driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"v1/tasks\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"v1/tasks\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"v1/tasks\")]/fieldset[3]/button";
        String taskName = "Task number" + generator.nextInt(1000000);
        String taskContent = taskName + "content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;
        Thread.sleep(2000);
        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyform -> anyform.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement selectElement1 = theForm.findElement(By.xpath(".//select[2]"));
                    Select select1 = new Select(selectElement1);
                    select1.selectByIndex(2);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);


        driverTrello.findElement(By.id("user")).sendKeys("");
        driverTrello.findElement(By.id("password")).sendKeys("");
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();

        Thread.sleep(2000);
        driverTrello.findElement(By.id("password")).sendKeys("");
        driverTrello.findElement(By.id("login-submit")).submit();
        Thread.sleep(2000);
        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla-application\"]")).size() > 0)
                .forEach(WebElement::click);
        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .anyMatch(thespan -> thespan.getText().equals(taskName));
        return result;
    }

    private void deleteTaskFromCrudApp(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        Thread.sleep(2000);
        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyform -> anyform.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement deleteTaskName =
                            theForm.findElement(By.xpath(".//button[@data-task-delete-button]"));
                    deleteTaskName.click();
                });
        Thread.sleep(5000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        driver.switchTo().alert().accept();
        assertTrue(checkTaskExistsInTrello(taskName));
        deleteTaskFromCrudApp(taskName);
    }
}
