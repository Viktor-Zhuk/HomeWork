package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] inputs = new int[10];
    private int counter;

    public Player(String name) {
        this.name = name;
        setInputs();
    }

    public void setInputs() {
        Arrays.fill(inputs, 0, counter, 0);
        counter = 0;
    }

    public boolean addNumber(int number) {
        inputs[counter] = number;
        counter++;
        if (counter < 10) {
            return false;
        } else {
            return true;
        }
    }

    public void printInputs() {
        System.out.print(name + " ");
        System.out.println(Arrays.toString(Arrays.copyOf(inputs, counter)));
        setInputs();
    }

    public void printWinner() {
        System.out.println("Игрок " + name + " угадал число " + inputs[counter - 1] + " с " + counter + " попытки");
    }

    @Override
    public String toString() {
        return name;
    }    
}