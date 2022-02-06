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
        int number = random.nextInt(100) + 1;
        boolean isPlay = true;
        while (isPlay) {
            for (int i = 0; i < players.length; i++) {
                System.out.print(players[i] + " ваш вариант ответа: ");
                int playerAnswer = sc.nextInt();
                players[i].addNumber(playerAnswer);
                if (checkNumber(players[i], playerAnswer, number)) {
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
        printValues(players);
    }

    public boolean checkNumber(Player player, int playerAnswer, int number) {
        boolean isСorrectАnswer = false;
        if (playerAnswer > number) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (playerAnswer < number) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляем! " + player + " вы угадали.");
            System.out.println("Игрок " + player + " угадал число " + playerAnswer + " с " +
                    player.getCountAttempts() + " попытки");
            isСorrectАnswer = true;
        }
        return isСorrectАnswer;
    }

    public void printValues(Player[] playersInGame) {
        for (int i = 0; i < playersInGame.length; i++) {
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