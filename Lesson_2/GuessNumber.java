import java.util.Scanner;

public class GuessNumber {

    private String playerOne;
    private String playerTwo;
    private int number;

    public GuessNumber(String playerOne, String playerTwo, int number) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.number = number;
    }

    Scanner sc = new Scanner(System.in);

    public void beginPlay() {
        while (true) {
            System.out.print(playerOne + " ваш вариант ответа: ");
            int answer = sc.nextInt();
            if (answer > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (answer < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else { 
                System.out.println("Поздравляем! " + playerOne + " вы угадали.");
                break;
            }

            System.out.print(playerTwo + " ваш вариант ответа: ");
            answer = sc.nextInt();
            if (answer > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (answer < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else { 
                System.out.println("Поздравляем! " + playerTwo + " вы угадали.");
                break;
            }         
        }
    }
}