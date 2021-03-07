import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber = random.nextInt(101);
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        while(firstPlayer.getNumber() != secretNumber && secondPlayer.getNumber() != secretNumber) {
            System.out.println("Компьютер загадал " + secretNumber);
            System.out.print("Первый игрок, введите число: ");
            firstPlayer.setNumber(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setNumber(scanner.nextInt());

            compareNumber(firstPlayer);
            printCompareNimber(firstPlayer);
            compareNumber(secondPlayer);
            printCompareNimber(secondPlayer);
        }
        secretNumber = random.nextInt(101);
    }

    private boolean compareNumber(Player player) {
        if(player.getNumber() > secretNumber) {
            return false;
        } else if(player.getNumber() < secretNumber) {
            return false;
        } else {
            return true;
        }
    }

    private void printCompareNimber(Player player) {
        if(player.getNumber() > secretNumber) {
            System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
        } else if(player.getNumber() < secretNumber) {
            System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
        } else if(player.getNumber() == secretNumber) {
            System.out.println(player.getName() + " угадал!");
        }
    }


}

