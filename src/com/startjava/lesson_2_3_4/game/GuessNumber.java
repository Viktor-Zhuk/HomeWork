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
        Player[] currentPlayer = {playerOne, playerTwo};
        int i = 0;
        while (true) {
            System.out.print(currentPlayer[i] + " ваш вариант ответа: ");
            int answer = sc.nextInt();
            currentPlayer[i].addNumber(answer);
            if (answer > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (answer < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем! " + currentPlayer[i] + " вы угадали.");
                System.out.println("Игрок " + currentPlayer[i] + " угадал число " + answer + " с " +
                        currentPlayer[i].getCountAttempts() + " попытки");
                break;
            }
            if (currentPlayer[i].getCountAttempts() == 10) {
                System.out.println("У " + currentPlayer[i] + " закончились попытки");
                if (i == 1) {
                    break;
                }
            }
            if (i == 0) {
                i++;
            } else {
                i--;
            }
        }
        for (i = 0; i < currentPlayer.length; i++) {
            System.out.print(currentPlayer[i] + " ");
            System.out.println(Arrays.toString(Arrays.copyOf(currentPlayer[i].getArrayNumbers(), currentPlayer[i].getCountAttempts())));
            currentPlayer[i].clearNumbers();
        }
    }
}