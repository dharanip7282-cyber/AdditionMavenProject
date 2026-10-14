package com.example;

public class Addition {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        int result = addition.add(10, 20);
        System.out.println("First number: 10");
        System.out.println("Second number: 20");
        System.out.println("Sum: " + result);
    }
}
