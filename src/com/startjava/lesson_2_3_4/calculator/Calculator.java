package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String mathExpression) {
        String[] mathElemets = mathExpression.split(" ");
        int numberOne = Integer.parseInt(mathElemets[0]);
        int numberTwo = Integer.parseInt(mathElemets[2]);
        switch(mathElemets[1].charAt(0)) {
            case '+':
                return numberOne + numberTwo;
            case '-':
                return numberOne - numberTwo;
            case '*':
                return numberOne * numberTwo;
            case '/':
                return numberOne / numberTwo;
            case '^':
                return (int) Math.pow(numberOne, numberTwo);
            case '%':
                return numberOne % numberTwo;
        }
        return 0;
    }
}
