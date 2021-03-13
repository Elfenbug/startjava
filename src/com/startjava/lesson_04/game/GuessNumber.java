package com.startjava.lesson_04.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;
    int countFirstPlayer = 0;
    int countSecondPlayer = 0;
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
            firstPlayer.numbers[i] = firstPlayer.getNumber();
            countFirstPlayer++;
            if (compareNumbers(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
            secondPlayer.numbers[i] = secondPlayer.getNumber();
            countSecondPlayer++;
            if (compareNumbers(secondPlayer)) {
                break;
            }
        }
    }

    public void printInfo(Player firstPlayer, Player secondPlayer) {


        if(firstPlayer.getNumber() == secretNumber) {
            System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + secretNumber + " с " + countFirstPlayer + " попытки");
        } else if(secondPlayer.getNumber() == secretNumber) {
            System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + secretNumber + " с " + countSecondPlayer + " попытки");
        }
        System.out.println(Arrays.toString(Arrays.copyOf(firstPlayer.numbers, countFirstPlayer)));
        System.out.println(Arrays.toString(Arrays.copyOf(secondPlayer.numbers, countSecondPlayer)));
    }

    public void resetValues() {
        Arrays.fill(firstPlayer.numbers, 0, countFirstPlayer, 0);
        Arrays.fill(secondPlayer.numbers, 0, countSecondPlayer, 0);
        countFirstPlayer = 0;
        countSecondPlayer = 0;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName()+ ", введите число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if(player.getNumber() != secretNumber) {
            if(countFirstPlayer == 10) {
                System.out.println("У " + firstPlayer.getName() + " закончились попытки");
            } else if(countSecondPlayer == 10) {
                System.out.println("У " + secondPlayer.getName() + " закончились попытки");
            } else if (player.getNumber() > secretNumber) {
                System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
            } else if(player.getNumber() < secretNumber) {
                System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
            }
            return false;
        }
        System.out.println(player.getName() + " угадал!");
        return true;
    }
}

