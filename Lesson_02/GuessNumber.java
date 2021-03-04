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
        GuessNumber guessNumber = new GuessNumber();
        while(true) {
            System.out.println("Компьютер загадал " + compNumber);
            System.out.print("Первый игрок, введите число: ");
            GuessNumberTest.firstPlayer.setNumber(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setNumber(scanner.nextInt());

            if(firstPlayer.getNumber() != compNumber || secondPlayer.getNumber() != compNumber) {
                compareNumber(firstPlayer, compNumber);
                compareNumber(secondPlayer, compNumber);
            }

            if(firstPlayer.getNumber() == compNumber && secondPlayer.getNumber() == compNumber) {
                System.out.println("Ничья!");
            }
            break;
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

