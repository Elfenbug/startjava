package com.startjava.lesson_04.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        
        String answer = "";
        while(!answer.equals("no")) {
            game.start();
            game.printInfo(firstPlayer, secondPlayer);
            game.resetValues();

            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
            if(answer.equals("yes")) {
                continue;
            } else {
                while(!answer.equals("no") && !answer.equals("yes")) {
                System.out.print("Повторите ввод: ");
                answer = scanner.nextLine();
                }
            }
        }
    }
}
