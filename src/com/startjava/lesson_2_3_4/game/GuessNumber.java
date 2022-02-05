package com.startjava.lesson_2_3_4.game;

import javafx.print.PageLayout;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }  

    public void start() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Player[] playersInGame = {playerOne, playerTwo};
        int i = 2;
        while (playersInGame[1].getCountAttempts() < 10) {
            int j = i % 2;
            System.out.print(playersInGame[j] + " ваш вариант ответа: ");
            int numberVariant = sc.nextInt();
            playersInGame[j].addNumber(numberVariant);
            if (numberVariant > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (numberVariant < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем! " + playersInGame[j] + " вы угадали.");
                System.out.println("Игрок " + playersInGame[j] + " угадал число " + numberVariant + " с " +
                        playersInGame[j].getCountAttempts() + " попытки");
                break;
            }
            if (playersInGame[j].getCountAttempts() == 10) {
                System.out.println("У " + playersInGame[j] + " закончились попытки");
            }
            i++;
        }
        for (i = 0; i < playersInGame.length; i++) {
            int[] enteredNumbers = playersInGame[i].getNumbers();
            System.out.print(playersInGame[i] + " ");
            for (int num : enteredNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
            playersInGame[i].clearNumbers();
        }
    }
}