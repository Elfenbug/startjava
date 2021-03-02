import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public static GuessNumber guessNumber = new GuessNumber();
    public static Player firstPlayer;
    public static Player secondPlayer;
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        System.out.print("Введите имя первого игрока: ");
        firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        secondPlayer = new Player(scanner.nextLine());

        guessNumber.startGame();
    }
}
