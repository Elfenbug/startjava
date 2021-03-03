import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    Scanner scanner = new Scanner(System.in);
    static GuessNumber guessNumber = new GuessNumber(GuessNumber.firstPlayer, GuessNumber.secondPlayer);
    
    public static void main(String args[]) {
//        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        guessNumber.firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        guessNumber.secondPlayer = new Player(scanner.nextLine());

        guessNumber.startGame();

        String answer;
        if(guessNumber.firstPlayer.getNumber() == compNumber || guessNumber.secondPlayer.getNumber() == compNumber) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            scanner.nextLine();
            answer = scanner.nextLine();
        }

        while(true) {
            if(answer.equals("no")) {
                break;
            } else if(answer.equals("yes")) {
                compNumber = random.nextInt(101);
                break;
                } else {
                    System.out.print("Повторите ввод: ");
                    answer = scanner.nextLine();
                    continue;
                }
        } break;
    }
}
