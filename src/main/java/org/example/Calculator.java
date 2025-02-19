package org.example;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers cannot have a square root.");
        }
        return Math.sqrt(number);
    }

    public String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return Integer.toBinaryString(number);
    }

    public int square(int number) {
        return number * number;
    }
}
