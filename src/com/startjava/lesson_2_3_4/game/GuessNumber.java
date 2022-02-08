package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player[] players = new Player[2];

    public GuessNumber(Player playerOne, Player playerTwo) {
        players[0] = playerOne;
        players[1] = playerTwo;
    }  

    public void start() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;
        boolean isPlay = true;
        while (isPlay) {
            for (int i = 0; i < players.length; i++) {
                System.out.print(players[i] + " ваш вариант ответа: ");
                int playerAnswer = sc.nextInt();
                players[i].addNumber(playerAnswer);
                if (checkNumber(players[i], hiddenNumber)) {
                    isPlay = false;
                    break;
                }
                if (players[i].getCountAttempts() == 10) {
                    System.out.println("У " + players[i] + " закончились попытки");
                }
            }
            if (players[1].getCountAttempts() == 10) {
                break;
            }
        }
        printPlayerNumbers(players);
        clearPlayerNumbers(players);
    }

    private boolean checkNumber(Player player, int number) {
        if (player.getLatestNumber() > number) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getLatestNumber() < number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляем! " + player + " вы угадали.");
            System.out.println("Игрок " + player + " угадал число " + player.getLatestNumber() + " с " +
                    player.getCountAttempts() + " попытки");
            return true;
        }
        return false;
    }

    private void printPlayerNumbers(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            int[] enteredNumbers = players[i].getNumbers();
            System.out.print(players[i] + " ");
            for (int number : enteredNumbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private void clearPlayerNumbers(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            players[i].clearNumbers();
        }
    }
}