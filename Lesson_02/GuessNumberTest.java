import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        guessNumber.startGame();
        
        String answer = new String();
        while(true) {
            if(firstPlayer.getNumber() == guessNumber.compNumber || secondPlayer.getNumber() == guessNumber.compNumber) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
            }
                if(answer.equals("no")) {
                    break;
                }
                if(answer.equals("yes")) {
                    guessNumber.compNumber = guessNumber.random.nextInt(101);
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
