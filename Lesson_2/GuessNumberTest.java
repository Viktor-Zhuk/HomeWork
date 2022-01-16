import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Random random = new Random();

        // Имена игроков
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(sc.nextLine());
        System.out.print("Введите имя второго игрока: "); 
        Player playerTwo = new Player(sc.nextLine());

        while (true) {
            int randomNumber = random.nextInt(100) + 1;
            GuessNumber guessNumber = new GuessNumber(playerOne.getName(), playerTwo.getName(), 
            randomNumber);
            guessNumber.beginPlay();

            System.out.println("Хотите продолжить игру? [yes/no]:");
            String answer = sc.nextLine();


        }
    }
}