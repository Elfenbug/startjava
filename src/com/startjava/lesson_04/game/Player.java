package com.startjava.lesson_04.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attemptNumber;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptNumber + 1);
    }

    public void setNumber(int number) {
        numbers[attemptNumber] = number;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public void resetNumbersAndAttemptNumber() {
        Arrays.fill(numbers, 0, attemptNumber, 0);
        attemptNumber = 0;
    }
}