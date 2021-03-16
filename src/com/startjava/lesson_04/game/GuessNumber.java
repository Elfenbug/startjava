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
        player.setNumbers(scanner.nextInt());
        player.setAttemptNumber(player.getAttemptNumber() + 1);
    }

    private boolean compareNumbers(Player player) {
        if(player.getNumbers()[player.getAttemptNumber() - 1] != secretNumber) {
            System.out.println(player.getName() + " введенное вами число " + ((player.getNumbers()[player.getAttemptNumber() - 1] > secretNumber) ? "больше" : "меньше") + " того, что загадал компьютер");
            return false;
        }
        System.out.println(player.getName() + " угадал!");
        return true;
    }

    private void tryCounter() {
        if(firstPlayer.getAttemptNumber() == 10) {
            System.out.println("У " + firstPlayer.getName() + " закончились попытки");
        } else if(secondPlayer.getAttemptNumber() == 10) {
            System.out.println("У " + secondPlayer.getName() + " закончились попытки");
        }
    }

    private void printInfo(Player firstPlayer, Player secondPlayer) {
        if(firstPlayer.getNumbers()[firstPlayer.getAttemptNumber() - 1] == secretNumber) {
            System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + secretNumber + " с " + firstPlayer.getAttemptNumber() + " попытки");
        } else if(secondPlayer.getNumbers()[secondPlayer.getAttemptNumber() - 1] == secretNumber) {
            System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + secretNumber + " с " + secondPlayer.getAttemptNumber() + " попытки");
        }
        System.out.println(Arrays.toString(Arrays.copyOf(firstPlayer.getNumbers(), firstPlayer.getAttemptNumber())));
        System.out.println(Arrays.toString(Arrays.copyOf(secondPlayer.getNumbers(), secondPlayer.getAttemptNumber())));
    }
}

