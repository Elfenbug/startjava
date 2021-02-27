import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String args[]) {
        Random random = new Random();
        int compNumber = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        GuessNumber chekNum = new GuessNumber();
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());

        while(true) {
            System.out.println("Компьютер загадал " + compNumber);
            System.out.print("Первый игрок, введите число: ");
            firstPlayer.setAnswer(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setAnswer(scanner.nextInt());

            if(firstPlayer.getAnswer() != compNumber || secondPlayer.getAnswer() != compNumber) {
                chekNum.compareNumber(firstPlayer, compNumber);
                chekNum.compareNumber(secondPlayer, compNumber);
                continue;
            } else if(firstPlayer.getAnswer() == compNumber && secondPlayer.getAnswer() == compNumber) {
                System.out.println("Ничья!");
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                String answer = scanner.nextLine();
                    if(answer.equals("no")) {
                        break;
                    } else if(answer.equals("yes")) {
                        continue;
                    }
            } else if(firstPlayer.getAnswer() == compNumber || secondPlayer.getAnswer() == compNumber) {
                    System.out.print("Хотите продолжить игру? [yes/no]: ");
                    String answer = scanner.nextLine();
                    if(answer.equals("no")) {
                        break;
                    } else if(answer.equals("yes")) {
                        continue;
                    }
            }
        }
    }
}
