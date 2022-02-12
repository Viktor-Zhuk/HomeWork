package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public void clearNumbers() {
        Arrays.fill(enteredNumbers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public void addNumber(int number) {
        enteredNumbers[countAttempts] = number;
        countAttempts++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(enteredNumbers, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getLastNumber() {
        return enteredNumbers[countAttempts - 1];
    }

    @Override
    public String toString() {
        return name;
    }    
}