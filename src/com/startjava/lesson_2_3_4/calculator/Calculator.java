package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String mathString) {
        String[] mathElemets = mathString.split(" ");
        switch(mathElemets[1].charAt(0)) {
            case '+':
                return Integer.parseInt(mathElemets[0]) + Integer.parseInt(mathElemets[2]);
            case '-':
                return Integer.parseInt(mathElemets[0]) - Integer.parseInt(mathElemets[2]);
            case '*':
                return Integer.parseInt(mathElemets[0]) * Integer.parseInt(mathElemets[2]);
            case '/':
                return Integer.parseInt(mathElemets[0]) / Integer.parseInt(mathElemets[2]);
            case '^':
                return (int) Math.pow(Integer.parseInt(mathElemets[0]), Integer.parseInt(mathElemets[2]));
            case '%':
                return Integer.parseInt(mathElemets[0]) % Integer.parseInt(mathElemets[2]);
        }
        return 0;
    }
}
