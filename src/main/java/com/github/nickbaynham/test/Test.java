package com.github.nickbaynham.test;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TestManager testManager = new TestManager("this is a message.");
        System.out.println("Got Message: " + testManager.getMessage());
    }
}
