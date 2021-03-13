package com.startjava.lesson_04.game;

public class Player {
    private String name;
    private int number;
    private int[] numbers = new int[10];
    private int countPlayer;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getCountPlayer() {
        return countPlayer;
    }

    public void setCountPlayer(int countPlayer) {
        this.countPlayer = countPlayer;
    }
}