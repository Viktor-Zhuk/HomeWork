public class Calculator {

    private int result;

    public void calculate(int firstNumber, int secondNumber, char mathOperation) {    
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
