package com.github.nickbaynham.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public class CalculatorTest {
    private WebDriver driver;

    static final Logger log = getLogger(lookup().lookupClass());

    @Test
    public void testCalculator() {
        //Launch website
        driver.navigate().to("https://www.calculator.net/");

        //Maximize the browser
        driver.manage().window().maximize();

        // Click on Math Calculators
//        driver.findElement(By.xpath(".//*[@id = 'menu']/div[3]/a")).click();

        // Click on Percent Calculators
//        driver.findElement(By.xpath(".//*[@id = 'menu']/div[4]/div[3]/a")).click();

        // Enter value 10 in the first number of the percent Calculator
//        driver.findElement(By.id("cpar1")).sendKeys("10");

        // Enter value 50 in the second number of the percent Calculator
//        driver.findElement(By.id("cpar2")).sendKeys("50");

        // Click Calculate Button
//        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();


        // Get the Result Text based on its xpath
//        String result =
//                driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();


        // Print a Log In message to the screen
//        System.out.println(" The Result is " + result);

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
