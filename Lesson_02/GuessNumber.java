import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player firstPlayer;
    Player firstPlayer;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int compNumber = random.nextInt(101);

    public void startGame() {
        firstPlayer = new Player();
        firstPlayer = new Player();

        while(true) {
            System.out.println("Компьютер загадал " + compNumber);
            System.out.print("Первый игрок, введите число: ");
            firstPlayer.setNumber(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setNumber(scanner.nextInt());

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

