package com.github.nickbaynham.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SeleniumAcademyTest {
    private WebDriver driver;

    static final Logger log = getLogger(lookup().lookupClass());

    @Test
    void test() {
        // navigate to the website
        driver.get("http://demo-store.seleniumacademy.com/");
        // Validate page title
        assertEquals(driver.getTitle(), "Madison Island");


        // Navigate to Men's
        WebElement menu = driver.findElement(By.cssSelector(".level0[href='http://demo-store.seleniumacademy.com/men.html']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).build().perform();

        // Select All Men's
        WebElement viewAllMen = driver.findElement(By.cssSelector(".level1[href='http://demo-store.seleniumacademy.com/men.html']"));
        viewAllMen.click();

        WebElement mensPageHeader = driver.findElement(By.cssSelector("h1"));
        assertTrue(mensPageHeader.isDisplayed(), "The Men's page should be displayed.");
        assertEquals(mensPageHeader.getText(), "MEN");
    }
    @BeforeClass
    static void setupClass() {
    }

    @BeforeTest
    void setupTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();

        //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    void teardown() {
        driver.quit();
    }
}
