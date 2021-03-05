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

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber(GuessNumber secretNumber) {
        this.setNumber = setNumber;
    }

    public void startGame() {
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        while(true) {
            System.out.println("Компьютер загадал " + guessNumber.getSecretNumber());
            System.out.print("Первый игрок, введите число: ");
            firstPlayer.setNumber(scanner.nextInt());
            System.out.print("Второй игрок, введите число: ");
            secondPlayer.setNumber(scanner.nextInt());

            if(firstPlayer.getNumber() != guessNumber.getSecretNumber() || secondPlayer.getNumber() != guessNumber.getSecretNumber()) {
                compareNumber(firstPlayer, guessNumber.getSecretNumber());
                compareNumber(secondPlayer, guessNumber.getSecretNumber());
            }

            if(firstPlayer.getNumber() == guessNumber.getSecretNumber() && secondPlayer.getNumber() == guessNumber.getSecretNumber()) {
                System.out.println("Ничья!");
                break;
            }

            if(firstPlayer.getNumber() == guessNumber.getSecretNumber()) {
                System.out.println(firstPlayer.getName() + " победил!");
                break;
            } else if(secondPlayer.getNumber() == guessNumber.getSecretNumber()) {
                System.out.println(secondPlayer.getName() + " победил!");
                break;
            }
        }
    }

    public void compareNumber(Player player, int secretNumber) {
        if(player.getNumber() > secretNumber) {
            System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
        } else if(player.getNumber() < secretNumber) {
            System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
        }
    }
}

