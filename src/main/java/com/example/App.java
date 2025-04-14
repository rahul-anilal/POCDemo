package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Divide: " + calc.divide(10, 0)); // ⚠️ Intentional error

        NumberParser parser = new NumberParser();
        System.out.println("Parsed: " + parser.parse(null)); // ⚠️ Intentional error

        StringUtils utils = new StringUtils();
        System.out.println("Words: " + utils.countWords(null)); // ⚠️ Intentional error
    }
}