import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public int compNumber = random.nextInt(101);

    public void startGame() {


        while(true) {
            System.out.println("Компьютер загадал " + compNumber);
            System.out.print("Первый игрок, введите число: ");
            firstPlayer.setNumber(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setNumber(scanner.nextInt());

            if(firstPlayer.getNumber() != compNumber || secondPlayer.getNumber() != compNumber) {
                GuessNumberTest.guessNumber.compareNumber(firstPlayer, compNumber);
                GuessNumberTest.guessNumber.compareNumber(secondPlayer, compNumber);
                continue;
            } else if(firstPlayer.getNumber() == compNumber && secondPlayer.getNumber() == compNumber) {
                System.out.println("Ничья!");
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                String answer = scanner.nextLine();
                    if(answer.equals("no")) {
                        break;
                    } else if(answer.equals("yes")) {
                        continue;
                    }
            } else if(firstPlayer.getNumber() == compNumber || secondPlayer.getNumber() == compNumber) {
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

    public void compareNumber(Player player, int compNumber) {
        if(player.getNumber() > compNumber) {
            System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
        } else if(player.getNumber() < compNumber) {
            System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
        } else if(player.getNumber() == compNumber)  {
            System.out.println("Вы угадали! " + player.getName() + " победил!");
        }
    }


}

