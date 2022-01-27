package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int result;

    public int calculate(int firstNumber, int secondNumber, char mathOperation) {
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
        return result;
    }
}
