package com.example;

public class AppTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Test Add: " + (calc.add(2, 3) == 5 ? "PASS" : "FAIL"));
    }
}