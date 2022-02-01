package com.startjava.lesson_2_3_4.game;

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
        while (true) {
            System.out.print(playerOne + " ваш вариант ответа: ");
            int answer = sc.nextInt();
            playerOne.addNumber(answer);
            if (answer > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (answer < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем! " + playerOne + " вы угадали.");
                System.out.println("Игрок " + playerOne + " угадал число " + answer + " с " + playerOne.countAttempts + " попытки");
                break;
            }
            if (playerOne.countAttempts == 10) {
                System.out.println("У " + playerOne + " закончились попытки");
            }

            System.out.print(playerTwo + " ваш вариант ответа: ");
            answer = sc.nextInt();
            playerTwo.addNumber(answer);
            if (answer > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (answer < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем! " + playerTwo + " вы угадали.");
                System.out.println("Игрок " + playerTwo + " угадал число " + answer + " с " + playerTwo.countAttempts + " попытки");
                break;
            }
            if (playerTwo.countAttempts == 10) {
                System.out.println("У " + playerTwo + " закончились попытки");
                break;
            }
        }
        playerOne.printInputs();
        playerTwo.printInputs();
    }
}