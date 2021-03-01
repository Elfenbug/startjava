import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    Random random = new Random();
    public int compNumber = random.nextInt(101);
    Scanner scanner = new Scanner(System.in);
    GuessNumber guessNumber = new GuessNumber();
    
    public static void main(String args[]) {
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());

        guessNumber.startGame();
    }
}
