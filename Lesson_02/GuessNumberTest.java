import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        
        String answer = "";
        do {
            game.start();

            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
            if(answer.equals("yes")) {
                continue;
            } else {
                System.out.print("Повторите ввод: ");
                answer = scanner.nextLine();
            }
        } while(!answer.equals("no"));
    }
}
