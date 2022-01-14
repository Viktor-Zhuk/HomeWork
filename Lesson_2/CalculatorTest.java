import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean helper = true;

        while (helper) {
            System.out.println("Введите первое число: ");
            int firstNumber = sc.nextInt();
            System.out.println("Введите знак математической операции: ");
            char mathOperation = sc.next().charAt(0);
            System.out.println("Введите второе число: ");
            int secondNumber = sc.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(firstNumber, secondNumber, mathOperation);
            
            boolean helper2 = true;
            while (helper2) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                String answer = sc.next();
                if (answer.equals("no")) {
                    helper = false;
                    helper2 = false;
                } else if (answer.equals("yes")) {
                    helper2 = false;
                } else {
                    System.out.println("Введите корректный ответ.");
                }
            }            
        }
    }
}
