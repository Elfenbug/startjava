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
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        guessNumber.startGame();
        
        String answer = null;
        while(true) {
            if(firstPlayer.getNumber() == guessNumber.getSecretNumber() || secondPlayer.getNumber() == guessNumber.getSecretNumber()) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
            }
                if(answer.equals("no")) {
                    break;
                }
                if(answer.equals("yes")) {
                    GuessNumber.setSecretNumbe(random.nextInt(101));
                    guessNumber.startGame();
                    continue;
                    } else {
                        System.out.print("Повторите ввод: ");
                        answer = scanner.nextLine();
                        scanner.nextLine();
                    }
        }
    }
}
