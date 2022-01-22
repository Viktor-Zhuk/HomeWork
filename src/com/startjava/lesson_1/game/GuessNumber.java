package com.startjava.lesson_1.game;

import java.util.Random;

public class GuessNumber {
    
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int playerNumber = 50;
        double helper = 50;
        while (playerNumber != randomNumber) {
            helper = Math.ceil(helper / 2);
            if (playereNumber > randomNumber) {
                playerNumber -= (int) helper;
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                exampleNumber += (int) helper;
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}