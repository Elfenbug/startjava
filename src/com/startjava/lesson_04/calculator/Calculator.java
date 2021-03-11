package com.startjava.lesson_04.calculator;

public class Calculator {
    private String mathExpression;

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public double calculate() {
        String[] elements = mathExpression.split("(/+|/-|/*|/|/^|%)");
        switch(elements[1]) {
            case "+":
                return Integer.parseInt(elements[0]) + Integer.parseInt(elements[2]);
            case "-":
                return Integer.parseInt(elements[0]) - Integer.parseInt(elements[2]);
            case "*":
                return Integer.parseInt(elements[0]) * Integer.parseInt(elements[2]);
            case "/":
                return Double.parseDouble(elements[0]) / Integer.parseInt(elements[2]);
            case "^":
                return Math.pow(Integer.parseInt(elements[0]), Integer.parseInt(elements[2]));
            case "%":
                return Integer.parseInt(elements[0]) % Integer.parseInt(elements[2]);
            default:
                System.out.println("Неверный ввод");
        } return 0;
    }
}