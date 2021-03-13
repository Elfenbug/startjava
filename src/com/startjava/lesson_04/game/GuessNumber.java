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

        int[] tempArrayFirst = new int[10];
        int[] tempArraySecond = new int[10];
        for (int i = 0; i < 10; i++) {
            inputNumber(firstPlayer);
            tempArrayFirst[i] = firstPlayer.getNumber();
            firstPlayer.setCountPlayer(firstPlayer.getCountPlayer() + 1);
            if (compareNumbers(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
            tempArraySecond[i] = secondPlayer.getNumber();
            secondPlayer.setCountPlayer(secondPlayer.getCountPlayer() + 1);
            if (compareNumbers(secondPlayer)) {
                break;
            }
        }

        firstPlayer.setNumbers(tempArrayFirst);
        secondPlayer.setNumbers(tempArraySecond);
        tryCounter();
        printInfo(firstPlayer, secondPlayer);
        resetValues();
    }

    private void printInfo(Player firstPlayer, Player secondPlayer) {
        if(firstPlayer.getNumber() == secretNumber) {
            System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + secretNumber + " с " + firstPlayer.getCountPlayer() + " попытки");
        } else if(secondPlayer.getNumber() == secretNumber) {
            System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + secretNumber + " с " + secondPlayer.getCountPlayer() + " попытки");
        }
        System.out.println(Arrays.toString(Arrays.copyOf(firstPlayer.getNumbers(), firstPlayer.getCountPlayer())));
        System.out.println(Arrays.toString(Arrays.copyOf(secondPlayer.getNumbers(), secondPlayer.getCountPlayer())));
    }

    private void resetValues() {
        Arrays.fill(firstPlayer.getNumbers(), 0, firstPlayer.getCountPlayer(), 0);
        Arrays.fill(secondPlayer.getNumbers(), 0, secondPlayer.getCountPlayer(), 0);
        firstPlayer.setCountPlayer(0);
        secondPlayer.setCountPlayer(0);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName()+ ", введите число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if(player.getNumber() != secretNumber) {
            if (player.getNumber() > secretNumber) {
                System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
            } else if(player.getNumber() < secretNumber) {
                System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
            }
            return false;
        }
        System.out.println(player.getName() + " угадал!");
        return true;
    }

    private void tryCounter() {
        if(firstPlayer.getCountPlayer() == 10) {
            System.out.println("У " + firstPlayer.getName() + " закончились попытки");
        } else if(secondPlayer.getCountPlayer() == 10) {
            System.out.println("У " + secondPlayer.getName() + " закончились попытки");
        }
    }
}

