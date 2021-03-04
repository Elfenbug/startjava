import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public GuessNumberTest(Player firstPlayer, Player secondPlayer) {

    }
    Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());
        GuessNumberTest guessNumberTest = new GuessNumberTest(firstPlayer, secondPlayer);


        guessNumber.startGame();

        String answer = new String();
        while(true) {
            if(firstPlayer.getNumber() == guessNumber.compNumber || secondPlayer.getNumber() == guessNumber.compNumber) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            scanner.nextLine();
            answer = scanner.nextLine();
            }
                while(true) {
                    if(answer.equals("no")) {
                        break;
                    } else if(answer.equals("yes")) {
                        guessNumber.compNumber = guessNumber.random.nextInt(101);
                        break;
                        } else {
                            System.out.print("Повторите ввод: ");
                            answer = scanner.nextLine();
                            continue;
                        }
                } 
            break;
        }
    }
}
