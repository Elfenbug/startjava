package com.startjava.lesson_04.game;

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
        secretNumber = random.nextInt(101);
        System.out.println("Компьютер загадал " + secretNumber);
        while(true) {
            inputNumber(firstPlayer);
            if(compareNumbers(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
            if(compareNumbers(secondPlayer)) {
                break;
            }
        }
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
}

