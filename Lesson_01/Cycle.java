public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int valueForFirstInterval = 6;
        while(valueForFirstInterval >= -6) {
            System.out.print(valueForFirstInterval + " ");
            valueForFirstInterval -= 2;
        }

        System.out.println();

        int valueForSecondInterval = 10;
        int sum = 0;
        do {
            if(valueForSecondInterval % 2 != 0) {
                sum += valueForSecondInterval;
            }
            valueForSecondInterval++;
        } while(valueForSecondInterval <= 20);
        System.out.println(sum);
    }
}