public class Calculator {
    
    public static void main(String[] args) {
        int firstNumber = 7;
        int secondNumber = 4;
        int result = 0;
        char mathOperation = '^';
        if (mathOperation == '+') {
            result = firstNumber + secondNumber;
        } else if (mathOperation == '-') {
            result = firstNumber - secondNumber;
        } else if (mathOperation == '*') {
            result = firstNumber * secondNumber;
        } else if (mathOperation == '/') {
            result = firstNumber / secondNumber;
        } else if (mathOperation == '^') {
            result = firstNumber;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
        } else if (mathOperation == '%') {
            result = firstNumber % secondNumber;
        }
        System.out.println("Результат вычисления равен: " + result);
    }
}
