public class Calculator {
    
    private int firstNumber;
    private int secondNumber;
    
    public void calculate(int firstNumber, int secondNumber, char mathOperation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        int result = 1;
        switch(mathOperation) {
            case '+': result = firstNumber + secondNumber;
                break;
            case '-': result = firstNumber - secondNumber;
                break;
            case '*': result = firstNumber * secondNumber;
                break;
            case '/': result = firstNumber / secondNumber;
                break;
            case '^': for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            case '%': result = firstNumber % secondNumber;
                break;
        }
        System.out.println("Результат вычисления равен: " + result);
    }
}
