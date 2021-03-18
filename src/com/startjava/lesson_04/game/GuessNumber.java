package com.startjava.lesson_04.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        System.out.println("У вас 10 попыток");
        secretNumber = random.nextInt(101);
        System.out.println("Компьютер загадал " + secretNumber);

        for (int i = 0; i < 10; i++) {
            inputNumber(firstPlayer);
            setAttemptNumber(player.getAttemptNumber() + 1);
            if (compareNumbers(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
            if (compareNumbers(secondPlayer)) {
                break;
            }
        }

        tryCounter();
        printInfo(firstPlayer, secondPlayer);
        firstPlayer.resetNumbersAndAttemptNumber();
        secondPlayer.resetNumbersAndAttemptNumber();
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName()+ ", введите число: ");
        player.setNumber(scanner.nextInt());
        player.setAttemptNumber(player.getAttemptNumber() + 1);
    }

    private boolean compareNumbers(Player player) {
        if(player.getLastNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал!");
            return true;
        }
        String moreLess = player.getLastNumber() > secretNumber ? "больше" : "меньше";
        System.out.println("Введенное вами число " + moreLess + " того, что загадал компьютер");
        return false;
    }

    private void tryCounter() {
        if(firstPlayer.getAttemptNumber() == 10) {
            System.out.println("У " + firstPlayer.getName() + " закончились попытки");
        } else if(secondPlayer.getAttemptNumber() == 10) {
            System.out.println("У " + secondPlayer.getName() + " закончились попытки");
        }
    }

    private void printInfo(Player firstPlayer, Player secondPlayer) {
        if(firstPlayer.getLastNumber() == secretNumber) {
            System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + secretNumber + " с " + firstPlayer.getAttemptNumber() + " попытки");
        } else if(secondPlayer.getLastNumber() == secretNumber) {
            System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + secretNumber + " с " + secondPlayer.getAttemptNumber() + " попытки");
        }
        printNumbers(firstPlayer);
        printNumbers(secondPlayer);
    }

    public void printNumbers(Player player) {
        for(int i = 0; i < player.getNumbers().length - 1; i++) {
            System.out.print(player.getNumbers()[i] + " ");
        }
        System.out.println();
    }
}

