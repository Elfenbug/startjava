import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player firstPlayer;
    Player secondPlayer;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int compNumber = random.nextInt(101);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
            this.firstPlayer = firstPlayer;
            this.secondPlayer = secondPlayer;
        }

    public void startGame() {
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        while(true) {
            System.out.println("Компьютер загадал " + compNumber);
            System.out.print("Первый игрок, введите число: ");
            firstPlayer.setNumber(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setNumber(scanner.nextInt());

            if(firstPlayer.getNumber() != compNumber || secondPlayer.getNumber() != compNumber) {
                compareNumber(firstPlayer, compNumber);
                compareNumber(secondPlayer, compNumber);
            }

            if(firstPlayer.getNumber() == compNumber && secondPlayer.getNumber() == compNumber) {
                System.out.println("Ничья!");
                break;
            }

            if(firstPlayer.getNumber() == compNumber) {
                System.out.println(firstPlayer.getName() + " победил!");
                break;
            } else if(secondPlayer.getNumber() == compNumber) {
                System.out.println(secondPlayer.getName() + " победил!");
                break;
            }
        }
    }

    public void compareNumber(Player player, int compNumber) {
        if(player.getNumber() > compNumber) {
            System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
        } else if(player.getNumber() < compNumber) {
            System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
        }
    }
}

