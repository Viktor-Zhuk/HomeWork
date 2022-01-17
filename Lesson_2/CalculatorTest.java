import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String answer = "yes";
        while (answer.equals("yes") || !answer.equals("yes") && !answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите первое число:");
                int firstNumber = sc.nextInt();
                System.out.println("Введите знак математической операции:");
                char mathOperation = sc.next().charAt(0);
                System.out.println("Введите второе число:");
                int secondNumber = sc.nextInt();
                sc.nextLine();

                Calculator calculator = new Calculator();
                calculator.calculate(firstNumber, secondNumber, mathOperation);
            }
            
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = sc.nextLine();   
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Введите корректный ответ.");
            }
        }
    }
}
