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
            GuessNumberTest.firstPlayer.setNumber(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            GuessNumberTest.secondPlayer.setNumber(scanner.nextInt());

            if(GuessNumberTest.firstPlayer.getNumber() != compNumber || GuessNumberTest.secondPlayer.getNumber() != compNumber) {
                GuessNumberTest.guessNumber.compareNumber(GuessNumberTest.firstPlayer, compNumber);
                GuessNumberTest.guessNumber.compareNumber(GuessNumberTest.secondPlayer, compNumber);
            } 

            if(GuessNumberTest.firstPlayer.getNumber() == compNumber && GuessNumberTest.secondPlayer.getNumber() == compNumber) {
                System.out.println("Ничья!");
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                String answer = scanner.nextLine();
                    if(answer.equals("no")) {
                        break;
                    } else if(answer.equals("yes")) {
                        continue;
                    }
            } else if(GuessNumberTest.firstPlayer.getNumber() == compNumber || GuessNumberTest.secondPlayer.getNumber() == compNumber) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                scanner.nextLine();
                String answer = scanner.nextLine();

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
                }

                if (answer.equals("no")) {
                    break;
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
            System.out.println(player.getName() + " победил!");
        }
    }
}

