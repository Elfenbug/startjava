public class GuessNumber {
    public static void main(String[] args) {
        int compNumber = 30;
        int userNumber = 2;

        if(userNumber != compNumber) {
            while(userNumber != compNumber) {
                if(userNumber == compNumber) {
                    System.out.println("Вы угадали!");
                } else if(userNumber > compNumber) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                    userNumber -= 1;
                } else if(userNumber < compNumber) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    userNumber += 1;
                }
            }
        }
        if(userNumber == compNumber) {
            System.out.println("Вы угадали!");
        }
    }
}