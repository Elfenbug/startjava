import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    

    public void playGame() {
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

    public void compareNumber(Player player, int compNumber) {
        if(player.getAnswer() > compNumber) {
            System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
        }

        if(player.getAnswer() < compNumber) {
            System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
        }
    }
}

