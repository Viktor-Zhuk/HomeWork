package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public void clearNumbers(int countAttempts) {
        Arrays.fill(enteredNumbers, 0, countAttempts, 0);
//        countAttempts = 0;
    }

    public boolean addNumber(int number, int countAttempts) {
        enteredNumbers[countAttempts] = number;
    }

    public void printInputs(int countAttempts) {
        System.out.print(name + " ");
        System.out.println(Arrays.toString(Arrays.copyOf(enteredNumbers, countAttempts)));
        clearNumbers();
    }

    public void printWinner(int countAttempts) {
        System.out.println("Игрок " + name + " угадал число " + enteredNumbers[countAttempts - 1] + " с " + countAttempts + " попытки");
    }

    @Override
    public String toString() {
        return name;
    }    
}