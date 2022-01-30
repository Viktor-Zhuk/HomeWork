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
            if (answer > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (answer < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем! " + playerOne + " вы угадали.");
                playerOne.addNumber(answer);
                playerOne.printWinner();
                break;
            }
            if (playerOne.addNumber(answer)) {
                System.out.println("У " + playerOne + " закончились попытки");
            }

            System.out.print(playerTwo + " ваш вариант ответа: ");
            answer = sc.nextInt();
            if (answer > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (answer < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем! " + playerTwo + " вы угадали.");
                playerTwo.addNumber(answer);
                playerTwo.printWinner();
                break;
            }
            if (playerTwo.addNumber(answer)) {
                System.out.println("У " + playerTwo + " закончились попытки");
                break;
            }
        }
        playerOne.printInputs();
        playerTwo.printInputs();
    }
}