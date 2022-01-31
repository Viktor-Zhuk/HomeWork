package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение: ");
                String mathString = sc.nextLine();

                Calculator calculator = new Calculator();
                System.out.println("Результат вычисления равен: " + calculator.calculate(mathString));
            }

            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = sc.nextLine();   
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Введите корректный ответ.");
            }
        }
    }
}
