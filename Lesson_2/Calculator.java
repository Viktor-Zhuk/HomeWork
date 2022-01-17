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
                result = 1;             
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            case '%': 
                result = firstNumber % secondNumber;
                break;
        }
        System.out.println("Результат вычисления равен: " + result);
    }
}
