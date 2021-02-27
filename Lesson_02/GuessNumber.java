public class GuessNumber {

    public void compareNumber(Player player, int compNumber) {
        if(player.getAnswer() > compNumber) {
            System.out.println(player.getName() + " введенное вами число больше того, что загадал компьютер");
        } else if(player.getAnswer() < compNumber) {
            System.out.println(player.getName() + " введенное вами число меньше того, что загадал компьютер");
        } else if(player.getAnswer() == compNumber)  {
            System.out.println("Вы угадали! " + player.getName() + " победил!");
        }
    }
}

