package com.startjava.lesson_04.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true) {
            System.out.print("Введите математическое выражение: ");
            calculator.setMathExpression(scanner.nextLine());

            System.out.println(calculator.calculate());

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String answer = scanner.nextLine();

            while(!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Повторите ввод");
                answer = scanner.nextLine();
            }

            if(answer.equals("yes")) {
                continue;
            } else {
                break;
            }
        }
    }
}