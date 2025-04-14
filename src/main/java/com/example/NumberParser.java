package com.example;

public class NumberParser {
    public int parse(String input) {
        return Integer.parseInt(input); // ⚠️ Could throw NullPointerException or NumberFormatException
    }
}