package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];
    int countAttempts = 0;

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

    public void printInputs() {
        System.out.print(name + " ");
        System.out.println(Arrays.toString(Arrays.copyOf(enteredNumbers, countAttempts)));
        clearNumbers();
    }

    @Override
    public String toString() {
        return name;
    }    
}