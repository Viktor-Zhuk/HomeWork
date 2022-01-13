import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = sc.nextInt();
        System.out.println("Введите знак математической операции: ");
        char mathOperation = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        int secondNumber = sc.nextInt();

        Calculator calculator = new Calculator();
        calculator.calculate(firstNumber, secondNumber, mathOperation);
    }
}
