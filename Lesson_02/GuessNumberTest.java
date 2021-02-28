import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String args[]) {
        Random random = new Random();
        int compNumber = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        GuessNumber checkNum = new GuessNumber();
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());

        while(true) {
            System.out.print("Первый игрок, введите число: ");
            firstPlayer.setAnswer(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setAnswer(scanner.nextInt());

            checkNum.compareNumber(firstPlayer, compNumber);
            checkNum.compareNumber(secondPlayer, compNumber);

            if(firstPlayer.getAnswer() != compNumber && secondPlayer.getAnswer() != compNumber) {
                continue;
            } else if(firstPlayer.getAnswer() == compNumber && secondPlayer.getAnswer() == compNumber) {
                System.out.println("Ничья! Компьютер загадал новое число!");
                compNumber = random.nextInt(101);
                continue;
            } else if(firstPlayer.getAnswer() == compNumber) {
                System.out.println("Победил первый игрок!");
            } else {
                System.out.println("Победил второй игрок!");
            }

            String answer;
            while(true) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
                    if(answer.equals("yes") || (answer.equals("no"))) {
                        break;
                    } else {
                        System.out.println("Повторите ввод");
                    }
            }

            if(answer.equals("yes")) {
                compNumber = random.nextInt(101);
                continue;
            } else {
                break;
            }
        }
    }
}

