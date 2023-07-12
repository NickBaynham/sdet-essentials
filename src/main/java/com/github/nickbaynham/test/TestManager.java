package com.github.nickbaynham.test;
// import io.github.bonigarcia.wdm.WebDriverManager;
public class TestManager {
    private final String message;

    public String getMessage() {
        return message;
    }

    public TestManager(String message) {
        this.message = message;
    }

    public void setup() {
        //WebDriverManager.chromedriver().setup();
    }
}