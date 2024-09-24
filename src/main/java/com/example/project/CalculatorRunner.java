package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator TI84 = new Calculator("TI84");
        System.out.println(TI84.performOperation("+",4, 3));
        System.out.println(TI84.divisibleBy(4,2));
        System.out.println(TI84.absoluteValue(4,5));
        System.out.println(TI84.coordinatePair(4,5));
        System.out.println(TI84.info());
    }
}
