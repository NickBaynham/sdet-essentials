package com.github.nickbaynham.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public class ExampleTest {
    private WebDriver driver;
    static final Logger log = getLogger(lookup().lookupClass());

    @Test
    public void testChrome() {
        String target_url = "https://www.google.com";
        driver.get(target_url);
        String title = driver.getTitle();
        log.debug("The title of {} is {}", target_url, title);

        // Verify
        assertThat(title).isEqualTo("Google");
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
