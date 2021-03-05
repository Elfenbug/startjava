import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        
        game.start();
        
        String answer = "";
        while(!answer.equals("no")) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
                if(answer.equals("yes")) {
                    game.setSecretNumber();
                    game.start();
                    continue;
                } else {
                    System.out.print("Повторите ввод: ");
                    answer = scanner.nextLine();
                } 
        }
    }
}
