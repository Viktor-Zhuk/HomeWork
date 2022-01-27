package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public void calculate(int firstNumber, int secondNumber, char mathOperation) { 
        int result = 0;   
        switch(mathOperation) {
            case '+': 
                result = firstNumber + secondNumber;
                break;
            case '-': 
                result = firstNumber - secondNumber;
                break;
            case '*': 
                result = firstNumber * secondNumber;
                break;
            case '/': 
                result = firstNumber / secondNumber;
                break;
            case '^':
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            case '%': 
                result = firstNumber % secondNumber;
                break;
        }
        System.out.println("Результат вычисления равен: " + result);
    }
}
