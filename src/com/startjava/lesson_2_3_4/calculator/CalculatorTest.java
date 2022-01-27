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
                String[] mathElemets = mathString.split(" ");

                Calculator calculator = new Calculator();
                calculator.calculate(Integer.parseInt(mathElemets[0]),Integer.parseInt(mathElemets[2]),
                        mathElemets[1].charAt(0));
            }
            
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = sc.nextLine();   
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Введите корректный ответ.");
            }
        }
    }
}
