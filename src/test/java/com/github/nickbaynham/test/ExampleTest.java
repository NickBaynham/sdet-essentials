package com.github.nickbaynham.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleTest {
    private WebDriver driver;

    @Test
    public void testChrome() {
        driver.manage().logs();
    }

    @BeforeClass
    static void setupClass() {
    }

    @BeforeTest
    void setupTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterTest
    void teardown() {
        driver.quit();
    }
}
