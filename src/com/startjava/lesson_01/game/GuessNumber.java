package com.startjava.lesson_01.game;

public class GuessNumber {
    public static void main(String[] args) {
        int compNumber = 30;
        int userNumber = 30;

        while(userNumber != compNumber) {
            if(userNumber > compNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                userNumber--;
            } else if(userNumber < compNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNumber++;
            }
        }

        if(userNumber == compNumber) {
            System.out.println("Вы угадали!");
        }
    }
}