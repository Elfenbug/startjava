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
        while(true) {
            System.out.println("Компьютер загадал " + secretNumber);
            System.out.print("Первый игрок, введите число: ");
            firstPlayer.setNumber(scanner.nextInt());
            if(compareNumbers(firstPlayer) == true) {
                break;
            }
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setNumber(scanner.nextInt());
            if(compareNumbers(secondPlayer)) {
                break;
            }
        }
    }

    private boolean compareNumbers(Player player) {
        if(player.getNumber() > secretNumber) {
            System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
            return false;
        } else if(player.getNumber() < secretNumber) {
            System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(player.getName() + " угадал!");
            secretNumber = random.nextInt(101);
            return true;
        }
    }
}

